package com.example.sectionpagerdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity
{  ViewPager viewPager;
    SectionPagerAdapter sectionPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        ArrayList<String> list=bundle.getStringArrayList(Constants.DATA);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        viewPager=findViewById(R.id.viewpager);
        sectionPagerAdapter =new SectionPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(sectionPagerAdapter);


    }
}
