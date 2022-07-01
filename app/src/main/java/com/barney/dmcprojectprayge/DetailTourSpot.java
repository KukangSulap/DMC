package com.barney.dmcprojectprayge;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailTourSpot extends AppCompatActivity {

    private TextView txtDetailDescTour, txtTitleTour, txtDetailRatingTour;
    private String header, deskripsi, rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tour_spot);
        txtTitleTour = findViewById(R.id.txtTitleTour);
        txtDetailDescTour = findViewById(R.id.txtDetailDescTour);
        txtDetailRatingTour = findViewById(R.id.txtDescRatingTour);

        header = getIntent().getStringExtra("tour_names");
        rating = getIntent().getStringExtra("tour_ratings");
        deskripsi = getIntent().getStringExtra("tour_desc");

        txtTitleTour.setText(header);
        txtDetailRatingTour.setText("Rating: " + rating + "/5");
        txtDetailDescTour.setText(deskripsi);

    }
}