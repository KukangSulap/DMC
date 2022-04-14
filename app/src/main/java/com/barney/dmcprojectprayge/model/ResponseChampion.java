package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class ResponseChampion{

	@SerializedName("data")
	private Data data;

	@SerializedName("format")
	private String format;

	@SerializedName("type")
	private String type;

	@SerializedName("version")
	private String version;

	public Data getData(){
		return data;
	}

	public String getFormat(){
		return format;
	}

	public String getType(){
		return type;
	}

	public String getVersion(){
		return version;
	}
}