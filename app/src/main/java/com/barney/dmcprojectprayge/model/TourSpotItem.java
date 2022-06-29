package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class TourSpotItem{

	@SerializedName("tour_name")
	private String tourName;

	@SerializedName("id_tour")
	private String idTour;

	@SerializedName("tour_desc")
	private String tourDesc;

	@SerializedName("tour_rating")
	private String tourRating;

	public String getTourName(){
		return tourName;
	}

	public String getIdTour(){
		return idTour;
	}

	public String getTourDesc(){
		return tourDesc;
	}

	public String getTourRating(){
		return tourRating;
	}
}