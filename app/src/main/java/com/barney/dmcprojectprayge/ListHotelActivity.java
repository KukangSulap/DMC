package com.barney.dmcprojectprayge;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import com.barney.dmcprojectprayge.adapter.HotelAdapter;
import com.barney.dmcprojectprayge.model.HotelItem;
import com.barney.dmcprojectprayge.model.ResponseHotel;
import com.barney.dmcprojectprayge.rest.ApiInterface;
import com.barney.dmcprojectprayge.rest.ApiService;
import com.google.gson.JsonArray;

import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ListHotelActivity extends AppCompatActivity {
    private RecyclerView view;
    HotelAdapter adapter;
    private int adapterPosition;
    private String id_hotel, hotel_name, hotel_desc, hotel_rating, ushi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);

        view = findViewById(R.id.listHotel);
        loadData();
    }

    public int getAdapterPosition() {
        return adapterPosition;
    }

    private void loadData() {
        ApiInterface apiService = ApiService.getInstance();
        Call<ResponseHotel> call = apiService.apiServiceHotel();
        call.enqueue(new Callback<ResponseHotel>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<ResponseHotel> call, Response<ResponseHotel> response) {
                List<HotelItem> hotelItems = response.body().getHotel();
                ushi = getIntent().getStringExtra("lokasi");
                List<HotelItem> pupui = hotelItems
                        .stream()
                        .filter(c -> c.getTourSpotTdkt().startsWith(ushi))
                        .collect(Collectors.toList());

                view.setLayoutManager(new LinearLayoutManager(ListHotelActivity.this));
                HotelAdapter adapter = new HotelAdapter(pupui);
                view.setAdapter(adapter);

            }
            @Override
            public void onFailure(Call<ResponseHotel> call, Throwable t) {
                System.out.println("gagal" + t);
            }
        });
    }

}