package com.barney.dmcprojectprayge.rest;

import com.barney.dmcprojectprayge.model.ResponseHotel;
import com.barney.dmcprojectprayge.model.ResponseResto;
import com.barney.dmcprojectprayge.model.ResponseTourSpot;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("read_hotel.php")
    Call<ResponseHotel> apiServiceHotel();

    @GET("read_resto.php")
    Call<ResponseResto> apiServiceResto();

    @GET("read_tour.php")
    Call<ResponseTourSpot> apiServiceTourSpot();

}
