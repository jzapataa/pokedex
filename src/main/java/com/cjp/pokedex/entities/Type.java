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
@Table(name = "type")
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDType;

	@Column(name = "typename")
	private String typename;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firstType", cascade = CascadeType.ALL)
	private List<Pokemon> pokemonsWithFirstType;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "secondType", cascade = CascadeType.ALL)
	private List<Pokemon> pokemonsWithSecondType;

	public Type() {
	}

	public Type(int IDType, String typename, List<Pokemon> pokemonsWithFirstType,
			List<Pokemon> pokemonsWithSecondType) {
		this.IDType = IDType;
		this.typename = typename;
		this.pokemonsWithFirstType = pokemonsWithFirstType;
		this.pokemonsWithSecondType = pokemonsWithSecondType;
	}

	public int getIDType() {
		return IDType;
	}

	public void setIDType(int IDType) {
		this.IDType = IDType;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public List<Pokemon> getPokemonsWithFirstType() {
		return pokemonsWithFirstType;
	}

	public void setPokemonsWithFirstType(List<Pokemon> pokemonsWithFirstType) {
		this.pokemonsWithFirstType = pokemonsWithFirstType;
	}

	public List<Pokemon> getPokemonsWithSecondType() {
		return pokemonsWithSecondType;
	}

	public void setPokemonsWithSecondType(List<Pokemon> pokemonsWithSecondType) {
		this.pokemonsWithSecondType = pokemonsWithSecondType;
	}

}
