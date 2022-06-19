package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class PilihLokasiActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String ushi = "";
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_lokasi);

        spinner = findViewById(R.id.spinner);
//        Button buttonOK = findViewById(R.id.buttonOK);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tour_spot, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        ushi = spinner.getSelectedItem().toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void sendMessageOK(View view) {
        ushi = spinner.getSelectedItem().toString();
        Intent miomio = new Intent(getApplicationContext(), ListHotelActivity.class);
        miomio.putExtra("lokasi", ushi);
        startActivity(miomio);
    }
}