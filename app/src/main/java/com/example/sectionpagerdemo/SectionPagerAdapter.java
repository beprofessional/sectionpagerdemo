package com.example.sectionpagerdemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    FragmentManager fm;
    ArrayList<String> list;
    public SectionPagerAdapter(@NonNull FragmentManager fm, ArrayList<String> list) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fm=fm;
        this.list =list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:return FirstFragment.getInstance(list.get(0));
            case 1:return FirstFragment.getInstance(list.get(1));
            case 2:return FirstFragment.getInstance(list.get(2));
            case 3:return FirstFragment.getInstance(list.get(3));
            case 4:return FirstFragment.getInstance(list.get(4));
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
