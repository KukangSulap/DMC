package com.barney.dmcprojectprayge.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseHotel{

	@SerializedName("hotel")
	private List<HotelItem> hotel;

	public List<HotelItem> getHotel(){
		return hotel;
	}

	@Override
 	public String toString(){
		return 
			"ResponseHotel{" + 
			"hotel = '" + hotel + '\'' + 
			"}";
		}
}