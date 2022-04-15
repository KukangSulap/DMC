package com.barney.dmcprojectprayge;

import com.barney.dmcprojectprayge.model.ResponseHotel;

import retrofit2.Call;
import retrofit2.http.GET;

interface ApiInterface {
    @GET("miomio.json")
    Call<ResponseHotel> apiService();
}
