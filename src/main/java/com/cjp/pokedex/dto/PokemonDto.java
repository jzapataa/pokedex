package com.cjp.pokedex.dto;

public class PokemonDto {

	private int IDpoke;

	private String pokename;

	private String description;

	private int HP;

	private int attack;

	private int defense;

	private int spattack;

	private int spdefense;

	private int speed;

	private boolean dualtype;

	private TypeDto firstType;

	private TypeDto secondType;

	public PokemonDto() {
	}

	public PokemonDto(int IDpoke, String pokename, String description, int HP, int attack, int defense, int spattack,
			int spdefense, int speed, boolean dualtype, TypeDto firstType, TypeDto secondType) {
		super();
		this.IDpoke = IDpoke;
		this.pokename = pokename;
		this.description = description;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense;
		this.spattack = spattack;
		this.spdefense = spdefense;
		this.speed = speed;
		this.dualtype = dualtype;
		this.firstType = firstType;
		this.secondType = secondType;
	}

	public int getIDpoke() {
		return IDpoke;
	}

	public void setIDpoke(int IDpoke) {
		this.IDpoke = IDpoke;
	}

	public String getPokename() {
		return pokename;
	}

	public void setPokename(String pokename) {
		this.pokename = pokename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpattack() {
		return spattack;
	}

	public void setSpattack(int spattack) {
		this.spattack = spattack;
	}

	public int getSpdefense() {
		return spdefense;
	}

	public void setSpdefense(int spdefense) {
		this.spdefense = spdefense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isDualtype() {
		return dualtype;
	}

	public void setDualtype(boolean dualtype) {
		this.dualtype = dualtype;
	}

	public TypeDto getFirstType() {
		return firstType;
	}

	public void setFirstType(TypeDto firstType) {
		this.firstType = firstType;
	}

	public TypeDto getSecondType() {
		return secondType;
	}

	public void setSecondType(TypeDto secondType) {
		this.secondType = secondType;
	}

}
