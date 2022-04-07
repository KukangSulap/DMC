package com.barney.dmcprojectprayge;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class HotelAdapter extends RecyclerView.Adapter<ViewHolder>{

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_cell, null);
      return new ViewHolder(v);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.txtHotelName.setText(hotel_names[position]);
      holder.txtHotelDesc.setText(hotel_desc[position]);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailHotel.class);
            intent.putExtra("hotel_names", hotel_names[holder.getAdapterPosition()]);
            intent.putExtra("hotel_desc", hotel_desc[holder.getAdapterPosition()]);
            view.getContext().startActivity(intent);
         }
      });

   }

   @Override
   public int getItemCount() {
      return hotel_names.length;
   }

   String[] hotel_names = {
           "Hotel 1", "Hotel 2", "Hotel 3", "Hotel 4", "Hotel 5", "Hotel 6"
   };

   String[] hotel_desc = {
           "Teemo scampers around, passively increasing his Move Speed until he is struck by an enemy champion or turret. ",
           "Itto is a tall man with a large build. He has white spiked hair with pale red streaks that goes down to his back. ",
           "Teemo scampers around, passively increasing his Move Speed until he is struck by an enemy champion or turret. ",
           "Itto is a tall man with a large build. He has white spiked hair with pale red streaks that goes down to his back.",
           "He is the courageous and reliable general of the Watatsumi Army, a leader whose men can always place their trust in.",
           "He is the courageous and reliable general of the Watatsumi Army, a leader whose men can always place their trust in."
   };

}
