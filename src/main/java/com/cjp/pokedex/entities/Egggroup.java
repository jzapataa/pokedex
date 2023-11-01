package com.cjp.pokedex.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "egggroup")
public class Egggroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDEgg;

	@Column(name = "eggname")
	private String eggname;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firstEggGroup", cascade = CascadeType.ALL)
	private List<Pokemon> pokemonsWithFirstEggGroup;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "secondEggGroup", cascade = CascadeType.ALL)
	private List<Pokemon> pokemonsWithSecondEggGroup;

	public Egggroup() {
	}

	public Egggroup(int IDEgg, String eggname, List<Pokemon> pokemonsWithFirstEggGroup,
			List<Pokemon> pokemonsWithSecondEggGroup) {
		this.IDEgg = IDEgg;
		this.eggname = eggname;
		this.pokemonsWithFirstEggGroup = pokemonsWithFirstEggGroup;
		this.pokemonsWithSecondEggGroup = pokemonsWithSecondEggGroup;
	}

	public int getIDEgg() {
		return IDEgg;
	}

	public void setIDEgg(int iDEgg) {
		IDEgg = iDEgg;
	}

	public String getEggname() {
		return eggname;
	}

	public void setEggname(String eggname) {
		this.eggname = eggname;
	}

	public List<Pokemon> getPokemonsWithFirstEggGroup() {
		return pokemonsWithFirstEggGroup;
	}

	public void setPokemonsWithFirstEggGroup(List<Pokemon> pokemonsWithFirstEggGroup) {
		this.pokemonsWithFirstEggGroup = pokemonsWithFirstEggGroup;
	}

	public List<Pokemon> getPokemonsWithSecondEggGroup() {
		return pokemonsWithSecondEggGroup;
	}

	public void setPokemonsWithSecondEggGroup(List<Pokemon> pokemonsWithSecondEggGroup) {
		this.pokemonsWithSecondEggGroup = pokemonsWithSecondEggGroup;
	}

}
