package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage1(View view) {
        Intent intent = new Intent(MainActivity.this, PilihLokasiActivity.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(MainActivity.this, ListRestaurantActivity.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(MainActivity.this, ListTourSpotActivity.class);
        startActivity(intent);
    }
}