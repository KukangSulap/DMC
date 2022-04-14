package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
        view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HotelAdapter();
        view.setAdapter(adapter);
    }

    public int getAdapterPosition() {
        return adapterPosition;
    }

    private void loadData() {
        ApiService apiService = ApiService.getInstance();
        Call<ResponseChampion> call = (Call<ResponseChampion>) apiService;
        call.enqueue(new Callback<ResponseChampion>() {
            @Override
            public void onResponse(Call<ResponseChampion> call, Response<ResponseChampion> response) {

//                    List<ArticlesItem> articlesItems = response.body().getArticles();
//                    Log.e("Response",response.body().getStatus());
//                    rvNews.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//                    CustomAdapter adapter = new CustomAdapter(articlesItems, MainActivity.this);
//                    rvNews.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<com.barney.dmcprojectprayge.model.ResponseChampion> call, Throwable t) {
            }
        });
    }

}