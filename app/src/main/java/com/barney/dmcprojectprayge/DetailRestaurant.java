package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailRestaurant extends AppCompatActivity {

    private TextView txtDetailDescResto, txtTitleResto, txtDetailRatingResto;
    private String header, deskripsi, rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_restaurant);

        txtTitleResto = findViewById(R.id.txtTitleResto);
        txtDetailDescResto = findViewById(R.id.txtDetailDescResto);
        txtDetailRatingResto = findViewById(R.id.txtDescRatingResto);

        header = getIntent().getStringExtra("resto_names");
        rating = getIntent().getStringExtra("resto_ratings");
        deskripsi = getIntent().getStringExtra("resto_desc");

        txtTitleResto.setText(header);
        txtDetailRatingResto.setText("Rating: " + rating + "/5");
        txtDetailDescResto.setText(deskripsi);

    }
}