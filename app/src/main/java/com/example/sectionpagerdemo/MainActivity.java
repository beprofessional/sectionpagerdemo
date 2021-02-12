package com.example.sectionpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Country> countryArrayList = new ArrayList<>();
    CountryAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryArrayList.add(new Country("Lucknow", "Uttar Pradesh"));
        countryArrayList.add(new Country("Mumbai", "Maharashtra"));
        countryArrayList.add(new Country("Dehradun", "Uttarakhand"));
        countryArrayList.add(new Country("Kolkata", "WestBengal"));
        countryArrayList.add(new Country("Bhopal", "Madhya Pradesh"));
        countryAdapter=new CountryAdapter(countryArrayList,this);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(countryAdapter);
    }
}