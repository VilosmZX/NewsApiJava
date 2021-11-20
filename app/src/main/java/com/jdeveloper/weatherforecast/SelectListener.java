package com.jdeveloper.weatherforecast;

import androidx.recyclerview.widget.RecyclerView;

import com.jdeveloper.weatherforecast.Models.NewsHeadlines;

public interface SelectListener {
    void onNewsClick(NewsHeadlines headlines);
}
