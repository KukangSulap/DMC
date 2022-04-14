package com.barney.dmcprojectprayge.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Azir{

	@SerializedName("image")
	private Image image;

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("partype")
	private String partype;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	@SerializedName("blurb")
	private String blurb;

	@SerializedName("version")
	private String version;

	@SerializedName("key")
	private String key;

	@SerializedName("info")
	private Info info;

	@SerializedName("tags")
	private List<String> tags;

	public Image getImage(){
		return image;
	}

	public Stats getStats(){
		return stats;
	}

	public String getPartype(){
		return partype;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getBlurb(){
		return blurb;
	}

	public String getVersion(){
		return version;
	}

	public String getKey(){
		return key;
	}

	public Info getInfo(){
		return info;
	}

	public List<String> getTags(){
		return tags;
	}
}