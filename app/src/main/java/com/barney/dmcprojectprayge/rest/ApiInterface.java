package com.barney.dmcprojectprayge.rest;

import com.barney.dmcprojectprayge.model.ResponseHotel;
import com.barney.dmcprojectprayge.model.ResponseResto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("miomio.json")
    Call<ResponseHotel> apiServiceHotel();

    @GET("read_resto.json")
    Call<ResponseResto> apiServiceResto();

}
