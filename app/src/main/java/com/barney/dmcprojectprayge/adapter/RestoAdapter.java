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
import com.barney.dmcprojectprayge.model.RestoItem;

import java.util.List;

public class RestoAdapter extends RecyclerView.Adapter<ViewHolder>{
   private List<RestoItem> restoItems;

   public RestoAdapter(List<RestoItem> restoItems) {
         this.restoItems = restoItems;
   }

      @Override
      public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_cell, null);
         return new ViewHolder(v);
      }

      @Override
      public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.txtRestoName.setText(restoItems.get(position).getRestoName());
         holder.txtRestoRating.setText(restoItems.get(position).getRestoRating());

//         holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Intent intent = new Intent(view.getContext(), DetailHotel.class);
//               intent.putExtra("resto_names", restoItems.get(holder.getAdapterPosition()).getRestoName());
//               intent.putExtra("resto_ratings", restoItems.get(holder.getAdapterPosition()).getRestoRating());
//               view.getContext().startActivity(intent);
//            }
//         });

      }

      @Override
      public int getItemCount() {
         return restoItems.size();
      }

}
