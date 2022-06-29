package com.barney.dmcprojectprayge;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.barney.dmcprojectprayge.adapter.TourSpotAdapter;
import com.barney.dmcprojectprayge.model.ResponseTourSpot;
import com.barney.dmcprojectprayge.model.TourSpotItem;
import com.barney.dmcprojectprayge.rest.ApiInterface;
import com.barney.dmcprojectprayge.rest.ApiService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PilihLokasiActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String ushi = "";
    private Spinner spinner;
    List<TourSpotItem> tourSpotItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_lokasi);

        spinner = findViewById(R.id.spinner);
//        Button buttonOK = findViewById(R.id.buttonOK);

        loadData();

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                tourSpotItems, android.R.layout.simple_spinner_item);
//        spinner.setAdapter(adapter);

    }

    private void loadData() {
        ApiInterface apiService = ApiService.getInstance();
        Call<ResponseTourSpot> call = apiService.apiServiceTourSpot();
        System.out.println("miomio");
        call.enqueue(new Callback<ResponseTourSpot>() {
            @Override
            public void onResponse(Call<ResponseTourSpot> call, Response<ResponseTourSpot> response) {
                tourSpotItems = response.body().getTourSpot();
                miomio();

            }

            @Override
            public void onFailure(Call<ResponseTourSpot> call, Throwable t) {
                System.out.println("gagal" + t);
            }
        });
    }

    public void miomio(){
        System.out.println("pupui"+tourSpotItems);
        ArrayList<String> map = new ArrayList();
        for (TourSpotItem item : tourSpotItems) {
            map.add(item.getTourName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, map);
        spinner.setAdapter(adapter);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

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