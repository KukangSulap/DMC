package com.barney.dmcprojectprayge.model;

import com.google.gson.annotations.SerializedName;

public class Stats{

	@SerializedName("mpregen")
	private double mpregen;

	@SerializedName("attackdamageperlevel")
	private double attackdamageperlevel;

	@SerializedName("mp")
	private int mp;

	@SerializedName("attackrange")
	private int attackrange;

	@SerializedName("hpperlevel")
	private int hpperlevel;

	@SerializedName("hp")
	private int hp;

	@SerializedName("hpregen")
	private double hpregen;

	@SerializedName("mpregenperlevel")
	private double mpregenperlevel;

	@SerializedName("spellblock")
	private int spellblock;

	@SerializedName("critperlevel")
	private int critperlevel;

	@SerializedName("movespeed")
	private int movespeed;

	@SerializedName("mpperlevel")
	private int mpperlevel;

	@SerializedName("armor")
	private int armor;

	@SerializedName("armorperlevel")
	private int armorperlevel;

	@SerializedName("crit")
	private int crit;

	@SerializedName("attackdamage")
	private int attackdamage;

	@SerializedName("attackspeed")
	private double attackspeed;

	@SerializedName("spellblockperlevel")
	private double spellblockperlevel;

	@SerializedName("attackspeedperlevel")
	private double attackspeedperlevel;

	@SerializedName("hpregenperlevel")
	private double hpregenperlevel;

	public double getMpregen(){
		return mpregen;
	}

	public double getAttackdamageperlevel(){
		return attackdamageperlevel;
	}

	public int getMp(){
		return mp;
	}

	public int getAttackrange(){
		return attackrange;
	}

	public int getHpperlevel(){
		return hpperlevel;
	}

	public int getHp(){
		return hp;
	}

	public double getHpregen(){
		return hpregen;
	}

	public double getMpregenperlevel(){
		return mpregenperlevel;
	}

	public int getSpellblock(){
		return spellblock;
	}

	public int getCritperlevel(){
		return critperlevel;
	}

	public int getMovespeed(){
		return movespeed;
	}

	public int getMpperlevel(){
		return mpperlevel;
	}

	public int getArmor(){
		return armor;
	}

	public int getArmorperlevel(){
		return armorperlevel;
	}

	public int getCrit(){
		return crit;
	}

	public int getAttackdamage(){
		return attackdamage;
	}

	public double getAttackspeed(){
		return attackspeed;
	}

	public double getSpellblockperlevel(){
		return spellblockperlevel;
	}

	public double getAttackspeedperlevel(){
		return attackspeedperlevel;
	}

	public double getHpregenperlevel(){
		return hpregenperlevel;
	}
}