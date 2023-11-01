package com.cjp.pokedex.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TypeDto {

	private int IDType;

	private String typename;

	@JsonIgnore
	private List<PokemonDto> pokemonsWithFirstType;

	@JsonIgnore
	private List<PokemonDto> pokemonsWithSecondType;

	public TypeDto() {
	}

	public TypeDto(int IDType, String typename, List<PokemonDto> pokemonsWithFirstType,
			List<PokemonDto> pokemonsWithSecondType) {
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

	public List<PokemonDto> getPokemonsWithFirstType() {
		return pokemonsWithFirstType;
	}

	public void setPokemonsWithFirstType(List<PokemonDto> pokemonsWithFirstType) {
		this.pokemonsWithFirstType = pokemonsWithFirstType;
	}

	public List<PokemonDto> getPokemonsWithSecondType() {
		return pokemonsWithSecondType;
	}

	public void setPokemonsWithSecondType(List<PokemonDto> pokemonsWithSecondType) {
		this.pokemonsWithSecondType = pokemonsWithSecondType;
	}

}
