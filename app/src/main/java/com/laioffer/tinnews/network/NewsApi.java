package com.laioffer.tinnews.network;

import com.laioffer.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {

    @GET("top-headlines")
    public Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    @GET("everything")
    public Call<NewsResponse> getEverything(@Query("q") String query, @Query("pageSize") int pageSize);

}