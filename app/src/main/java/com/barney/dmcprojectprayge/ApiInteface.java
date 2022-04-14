package com.barney.dmcprojectprayge;

import retrofit2.Call;
import retrofit2.http.GET;

interface ApiInteface {
 @GET("cdn/11.20.1/data/en_US/champion.json")
 Call<ResponseChampion> apiService();
}
