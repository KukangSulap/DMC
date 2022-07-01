package com.barney.dmcprojectprayge;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
   public TextView txtHotelName,txtHotelDesc, txtRestoName, txtRestoRating,
           txtTourSpotName, txtTourSpotDesc, txtTourSpotRating;

   public ViewHolder(View itemView) {
      super(itemView);
      txtHotelName = itemView.findViewById(R.id.txtHotelName);
      txtHotelDesc = itemView.findViewById(R.id.txtDescHotel);
      txtRestoName = itemView.findViewById(R.id.txtRestaurantName);
      txtRestoRating = itemView.findViewById(R.id.txtRatingRestaurant);
      txtTourSpotRating = itemView.findViewById(R.id.txtTourSpotRating);
      txtTourSpotName = itemView.findViewById(R.id.txtTourSpotName);

   }
}