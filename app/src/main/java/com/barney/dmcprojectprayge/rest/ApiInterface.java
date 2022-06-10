package com.barney.dmcprojectprayge.rest;

import com.barney.dmcprojectprayge.model.ResponseHotel;
import com.barney.dmcprojectprayge.model.ResponseResto;
import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("read_hotel.php")
    Call<ResponseHotel> apiServiceHotel();

    @GET("read_resto.php")
    Call<ResponseResto> apiServiceResto();

}
