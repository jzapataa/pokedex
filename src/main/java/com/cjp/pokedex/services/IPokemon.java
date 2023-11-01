package com.cjp.pokedex.services;

import java.util.List;

import com.cjp.pokedex.dto.PokemonDto;

public interface IPokemon {
	
	List<PokemonDto> findAll();
	PokemonDto findById(int id);
	PokemonDto save(PokemonDto save);
	void delete(int id);

}
