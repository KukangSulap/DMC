package com.barney.dmcprojectprayge.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
   private static final String Weburl = "https://cushioned-specialty.000webhostapp.com/";

   private static Retrofit setInit() {
      return new  Retrofit.Builder()
              .baseUrl(Weburl)
              .addConverterFactory(GsonConverterFactory.create())
              .build();
   }
   public static ApiInterface getInstance() {
      return setInit() .create(ApiInterface.class);

   }
}
