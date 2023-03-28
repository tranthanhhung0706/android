package com.example.app_movie_ticket.Api;

import com.example.app_movie_ticket.Model.Movie;
import com.example.app_movie_ticket.Model.User;
import com.example.app_movie_ticket.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {
    Gson gson=new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();
    ApiService apiSevice=new Retrofit.Builder()
            .baseUrl(Utils.ip +"/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);
    @GET("user")
    Call<List<User>> getAll();

    @GET("movie")
    Call<List<Movie>> getAllMovie();



}
