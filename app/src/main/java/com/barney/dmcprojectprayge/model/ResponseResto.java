package com.barney.dmcprojectprayge.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseResto{

	@SerializedName("resto")
	private List<RestoItem> resto;

	public List<RestoItem> getResto(){
		return resto;
	}

	@Override
 	public String toString(){
		return 
			"ResponseResto{" + 
			"resto = '" + resto + '\'' + 
			"}";
		}
}