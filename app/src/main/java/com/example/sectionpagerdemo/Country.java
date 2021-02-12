package com.example.sectionpagerdemo;

public class Country {
    private String title,subtitle;
    public Country(String title, String subtitle)
    {
        this.title=title;
        this.subtitle=subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

