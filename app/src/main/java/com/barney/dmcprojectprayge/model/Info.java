package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class Info{

	@SerializedName("magic")
	private int magic;

	@SerializedName("difficulty")
	private int difficulty;

	@SerializedName("defense")
	private int defense;

	@SerializedName("attack")
	private int attack;

	public int getMagic(){
		return magic;
	}

	public int getDifficulty(){
		return difficulty;
	}

	public int getDefense(){
		return defense;
	}

	public int getAttack(){
		return attack;
	}
}