package com.barney.dmcprojectprayge;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class ApiService {
   private static final String Weburl = "http://ddragon.leagueoflegends.com/";

   private static Retrofit setInit() {
      return new  Retrofit.Builder()
              .baseUrl(Weburl)
              .addConverterFactory(GsonConverterFactory.create())
              .build();
   }
   public static ApiService getInstance() {
      return setInit() .create(ApiService.class);

   }
}
