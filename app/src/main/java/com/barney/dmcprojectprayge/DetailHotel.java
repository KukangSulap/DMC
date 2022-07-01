package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailHotel extends AppCompatActivity {

    private TextView txtDetailDescHotel, txtTitleHotel, txtDescRatingHotel;
    private String header, deskripsi, rating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        txtTitleHotel = findViewById(R.id.txtTitleHotel);
        txtDetailDescHotel = findViewById(R.id.txtDetailDescHotel);
        txtDescRatingHotel = findViewById(R.id.txtDescRatingHotel);

        header = getIntent().getStringExtra("hotel_names");
        deskripsi = getIntent().getStringExtra("hotel_desc");
        rating = getIntent().getStringExtra("hotel_rating");

        txtTitleHotel.setText(header);
        txtDetailDescHotel.setText(deskripsi);
        txtDescRatingHotel.setText("Rating: " + rating + "/5");

    }
}