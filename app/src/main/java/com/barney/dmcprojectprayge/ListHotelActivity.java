package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.barney.dmcprojectprayge.model.HotelItem;
import com.barney.dmcprojectprayge.model.ResponseHotel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ListHotelActivity extends AppCompatActivity {
    RecyclerView view;
    HotelAdapter adapter;
    int adapterPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);

        view = findViewById(R.id.listHotel);
//        view.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new HotelAdapter();
//        view.setAdapter(adapter);
        loadData();
    }

    public int getAdapterPosition() {
        return adapterPosition;
    }

    private void loadData() {
        ApiInterface apiService = ApiService.getInstance();
        Call<ResponseHotel> call = apiService.apiService();
        call.enqueue(new Callback<ResponseHotel>() {
            @Override
            public void onResponse(Call<ResponseHotel> call, Response<ResponseHotel> response) {
                System.out.println("error nya: " + response.code());
                List<HotelItem> hotelItems = response.body().getHotel();
                System.out.println("Size: " + hotelItems.size());
                view.setLayoutManager(new LinearLayoutManager(ListHotelActivity.this));
                HotelAdapter adapter = new HotelAdapter(hotelItems);
                view.setAdapter(adapter);

            }
            @Override
            public void onFailure(Call<ResponseHotel> call, Throwable t) {
                System.out.println("gagal" + t);
            }
        });
    }

}