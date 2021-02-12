package com.example.sectionpagerdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {
    ArrayList<Country> countryList;
     Context context;
    public CountryAdapter(ArrayList<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context=context;

    }

    @Override
    public CountryHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item,parent,false);
        return new CountryHolder(view,context);
    }


    @Override
    public void onBindViewHolder(CountryHolder holder, int position) {
        Country country = countryList.get(position);
        holder.title.setText(country.getTitle());
        holder.subtitle.setText(country.getSubtitle());
        holder. itemView.setOnClickListener(v->{
            ArrayList<String> list=new ArrayList();
            Intent send= new Intent(context,SecondActivity.class);
            for(int i=0;i<countryList.size();i++)
            {
                list.add(countryList.get(i).getTitle());
            }
            send.putStringArrayListExtra(Constants.DATA,list);
            context.startActivity(send);
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
    public static class CountryHolder extends RecyclerView.ViewHolder {
        TextView title,subtitle;
        public CountryHolder(View itemView,Context context) {
            super(itemView);
            title=itemView.findViewById(R.id.title_country);
            subtitle=itemView.findViewById((R.id.subtitle_country));

            title.setOnClickListener(v->{
                String data=title.getText().toString();
                Toast.makeText(v.getContext(),data+getAdapterPosition(),Toast.LENGTH_SHORT).show();
            });
        }
    }
}
