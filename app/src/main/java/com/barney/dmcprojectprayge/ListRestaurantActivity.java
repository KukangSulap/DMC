package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.barney.dmcprojectprayge.adapter.HotelAdapter;
import com.barney.dmcprojectprayge.adapter.RestoAdapter;
import com.barney.dmcprojectprayge.model.HotelItem;
import com.barney.dmcprojectprayge.model.ResponseHotel;
import com.barney.dmcprojectprayge.model.ResponseResto;
import com.barney.dmcprojectprayge.model.RestoItem;
import com.barney.dmcprojectprayge.rest.ApiInterface;
import com.barney.dmcprojectprayge.rest.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListRestaurantActivity extends AppCompatActivity {
    private RecyclerView view;
    private int adapterPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_restaurant);

        view = findViewById(R.id.listRestaurant);
        loadData();
    }

    public int getAdapterPosition() {
        return adapterPosition;
    }

    private void loadData() {
        ApiInterface apiService = ApiService.getInstance();
        Call<ResponseResto> call = apiService.apiServiceResto();
        call.enqueue(new Callback<ResponseResto>() {
            @Override
            public void onResponse(Call<ResponseResto> call, Response<ResponseResto> response) {
                System.out.println("error nya: " + response.code());
                List<RestoItem> restoItems = response.body().getResto();
                System.out.println("Size: " + restoItems.size());
                view.setLayoutManager(new LinearLayoutManager(ListRestaurantActivity.this));
                RestoAdapter adapter = new RestoAdapter(restoItems);
                view.setAdapter(adapter);

            }
            @Override
            public void onFailure(Call<ResponseResto> call, Throwable t) {
                System.out.println("gagal" + t);
            }
        });
    }
}