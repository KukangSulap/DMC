package com.barney.dmcprojectprayge.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.barney.dmcprojectprayge.DetailHotel;
import com.barney.dmcprojectprayge.R;
import com.barney.dmcprojectprayge.ViewHolder;
import com.barney.dmcprojectprayge.model.HotelItem;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<ViewHolder>{
   private List<HotelItem> hotelItems;

   public HotelAdapter(List<HotelItem> hotelItems) {
      this.hotelItems = hotelItems;
   }

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_cell, null);
      return new ViewHolder(v);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.txtHotelName.setText(hotelItems.get(position).getHotelName());
      holder.txtHotelDesc.setText(hotelItems.get(position).getHotelDesc());

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailHotel.class);
            intent.putExtra("hotel_names", hotelItems.get(holder.getAdapterPosition()).getHotelName());
            intent.putExtra("hotel_desc", hotelItems.get(holder.getAdapterPosition()).getHotelDesc());
            view.getContext().startActivity(intent);
         }
      });

   }

   @Override
   public int getItemCount() {
      return hotelItems.size();
   }

}
