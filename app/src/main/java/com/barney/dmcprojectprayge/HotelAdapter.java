package com.barney.dmcprojectprayge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class HotelAdapter extends RecyclerView.Adapter<ViewHolder> {

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_cell, null);
      return new ViewHolder(v);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.txtHotelName.setText(hotel_names[position]);

   }

   @Override
   public int getItemCount() {
      return hotel_names.length;
   }

   String[] hotel_names = {
           "hotel 1", "hotel 2", "hotel 3", "hotel 4", "hotel 5", "hotel 6"
   };

}
