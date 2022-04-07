package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

}