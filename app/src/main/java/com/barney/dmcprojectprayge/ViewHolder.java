package com.barney.dmcprojectprayge;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder {
   TextView txtHotelName, txtHotelDesc;

   public ViewHolder(View itemView) {
      super(itemView);
      txtHotelName = itemView.findViewById(R.id.txtHotelName);
      txtHotelDesc = itemView.findViewById(R.id.txtDescHotel);

   }
}