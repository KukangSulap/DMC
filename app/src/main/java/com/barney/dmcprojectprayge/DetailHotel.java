package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailHotel extends AppCompatActivity {

    private TextView txtDetailDescHotel, txtTitleHotel;
    private String header, deskripsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        txtTitleHotel = findViewById(R.id.txtTitleHotel);
        txtDetailDescHotel = findViewById(R.id.txtDetailDescHotel);

        header = getIntent().getStringExtra("hotel_names");
        deskripsi = getIntent().getStringExtra("hotel_desc");

        txtTitleHotel.setText(header);
        txtDetailDescHotel.setText(deskripsi);

    }
}