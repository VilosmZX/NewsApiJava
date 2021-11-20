package com.jdeveloper.weatherforecast;

import com.jdeveloper.weatherforecast.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String msg);
    void onError(String msg);
}
