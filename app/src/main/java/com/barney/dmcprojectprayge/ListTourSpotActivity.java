package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.barney.dmcprojectprayge.adapter.HotelAdapter;
import com.barney.dmcprojectprayge.adapter.TourSpotAdapter;
import com.barney.dmcprojectprayge.model.ResponseTourSpot;
import com.barney.dmcprojectprayge.model.TourSpotItem;
import com.barney.dmcprojectprayge.rest.ApiInterface;
import com.barney.dmcprojectprayge.rest.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListTourSpotActivity extends AppCompatActivity {
    private RecyclerView view;
    HotelAdapter adapter;
    private int adapterPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tour_spot);

        view = findViewById(R.id.listTourSpot);
        loadData();
    }

    public int getAdapterPosition() {
        return adapterPosition;
    }

    private void loadData() {
        ApiInterface apiService = ApiService.getInstance();
        Call<ResponseTourSpot> call = apiService.apiServiceTourSpot();
        System.out.println("miomio");
        call.enqueue(new Callback<ResponseTourSpot>() {
            @Override
            public void onResponse(Call<ResponseTourSpot> call, Response<ResponseTourSpot> response) {
                List<TourSpotItem> tourSpotItems = response.body().getTourSpot();
                System.out.println("Sizean: " + tourSpotItems.size());
                view.setLayoutManager(new LinearLayoutManager(ListTourSpotActivity.this));
                TourSpotAdapter adapter = new TourSpotAdapter(tourSpotItems);
                view.setAdapter(adapter);

            }
            @Override
            public void onFailure(Call<ResponseTourSpot> call, Throwable t) {
                System.out.println("gagal" + t);
            }
        });
    }
}