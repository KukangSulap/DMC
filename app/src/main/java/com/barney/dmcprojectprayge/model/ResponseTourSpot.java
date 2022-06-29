package com.barney.dmcprojectprayge.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTourSpot{

	@SerializedName("tourSpot")
	private List<TourSpotItem> tourSpot;

	public List<TourSpotItem> getTourSpot(){
		return tourSpot;
	}
}