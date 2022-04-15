package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class RestoItem{

	@SerializedName("resto_desc")
	private String restoDesc;

	@SerializedName("resto_name")
	private String restoName;

	@SerializedName("id_resto")
	private String idResto;

	@SerializedName("resto_rating")
	private String restoRating;

	public String getRestoDesc(){
		return restoDesc;
	}

	public String getRestoName(){
		return restoName;
	}

	public String getIdResto(){
		return idResto;
	}

	public String getRestoRating(){
		return restoRating;
	}

	@Override
 	public String toString(){
		return 
			"RestoItem{" + 
			"resto_desc = '" + restoDesc + '\'' + 
			",resto_name = '" + restoName + '\'' + 
			",id_resto = '" + idResto + '\'' + 
			",resto_rating = '" + restoRating + '\'' + 
			"}";
		}
}