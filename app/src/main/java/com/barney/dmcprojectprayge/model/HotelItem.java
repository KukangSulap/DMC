package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class HotelItem{

	@SerializedName("id_hotel")
	private String idHotel;

	@SerializedName("hotel_desc")
	private String hotelDesc;

	@SerializedName("hotel_rating")
	private String hotelRating;

	@SerializedName("hotel_name")
	private String hotelName;

	public String getIdHotel(){
		return idHotel;
	}

	public String getHotelDesc(){
		return hotelDesc;
	}

	public String getHotelRating(){
		return hotelRating;
	}

	public String getHotelName(){
		return hotelName;
	}

	@Override
 	public String toString(){
		return 
			"HotelItem{" + 
			"id_hotel = '" + idHotel + '\'' + 
			",hotel_desc = '" + hotelDesc + '\'' + 
			",hotel_rating = '" + hotelRating + '\'' + 
			",hotel_name = '" + hotelName + '\'' + 
			"}";
		}
}