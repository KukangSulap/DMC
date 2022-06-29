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
import com.barney.dmcprojectprayge.model.TourSpotItem;

import java.util.List;

public class TourSpotAdapter extends RecyclerView.Adapter<ViewHolder>{
   private List<TourSpotItem> tourSpotItems;

   public TourSpotAdapter(List<TourSpotItem> tourSpotItems) {
      this.tourSpotItems = tourSpotItems;
   }

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_spot_cell, null);
      return new ViewHolder(v);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.txtTourSpotName.setText(tourSpotItems.get(position).getTourName());
      holder.txtTourSpotDesc.setText(tourSpotItems.get(position).getTourDesc());
      holder.txtTourSpotRating.setText(tourSpotItems.get(position).getTourRating()+"/5");

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailHotel.class);
            intent.putExtra("hotel_names", tourSpotItems.get(holder.getAdapterPosition()).getTourName());
            intent.putExtra("hotel_desc", tourSpotItems.get(holder.getAdapterPosition()).getTourDesc());
            view.getContext().startActivity(intent);
         }
      });
   }

   @Override
   public int getItemCount() {
      System.out.println("print-an: "+ tourSpotItems);
      return tourSpotItems.size();

   }

}