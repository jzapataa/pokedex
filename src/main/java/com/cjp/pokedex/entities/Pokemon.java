package com.cjp.pokedex.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDpoke;

	@Column(name = "pokename")
	private String pokename;

	@Column(name = "description")
	private String description;

	@Column(name = "HP")
	private int HP;

	@Column(name = "attack")
	private int attack;

	@Column(name = "defense")
	private int defense;

	@Column(name = "spattack")
	private int spattack;

	@Column(name = "spdefense")
	private int spdefense;

	@Column(name = "speed")
	private int speed;

	@Column(name = "dualtype")
	private boolean dualtype;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "firstType", referencedColumnName = "IDType")
	private Type firstType;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "secondType", referencedColumnName = "IDType")
	private Type secondType;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "firstEggGroup", referencedColumnName = "IDEgg")
	private Egggroup firstEggGroup;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "secondEggGroup", referencedColumnName = "IDEgg")
	private Egggroup secondEggGroup;

	public Pokemon() {
	}

	public Pokemon(int iDpoke, String pokename, String description, int HP, int attack, int defense, int spattack,
			int spdefense, int speed, boolean dualtype, Type firstType, Type secondType, Egggroup firstEggGroup,
			Egggroup secondEggGroup) {
		super();
		IDpoke = iDpoke;
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
		this.firstEggGroup = firstEggGroup;
		this.secondEggGroup = secondEggGroup;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Type getFirstType() {
		return firstType;
	}

	public void setFirstType(Type firstType) {
		this.firstType = firstType;
	}

	public Type getSecondType() {
		return secondType;
	}

	public void setSecondType(Type secondType) {
		this.secondType = secondType;
	}

	public Egggroup getFirstEggGroup() {
		return firstEggGroup;
	}

	public void setFirstEggGroup(Egggroup firstEggGroup) {
		this.firstEggGroup = firstEggGroup;
	}

	public Egggroup getSecondEggGroup() {
		return secondEggGroup;
	}

	public void setSecondEggGroup(Egggroup secondEggGroup) {
		this.secondEggGroup = secondEggGroup;
	}

}
