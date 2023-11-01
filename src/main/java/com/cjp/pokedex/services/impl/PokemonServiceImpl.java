package com.cjp.pokedex.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjp.pokedex.dto.PokemonDto;
import com.cjp.pokedex.mapper.PokemonMapper;
import com.cjp.pokedex.repositories.PokemonRepository;
import com.cjp.pokedex.services.IPokemon;

@Service
public class PokemonServiceImpl implements IPokemon {
	
	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Autowired
	private PokemonMapper pokemonMapper;

	@Override
	@Transactional(readOnly = true)
	public List<PokemonDto> findAll() {
		
		return pokemonMapper.transformToDto(pokemonRepository.findAll());
	}

	@Override
	public PokemonDto findById(int id) {
		// TODO Auto-generated method stub
		return pokemonMapper.transformToDto(pokemonRepository.findById(id));
	}

	@Override
	public PokemonDto save(PokemonDto pokemonDto) {
		
		return pokemonMapper.transformToDto(pokemonRepository.save(pokemonMapper.transformToPojo(pokemonDto)));
	}

	@Override
	public void delete(int id) {
		pokemonRepository.deleteById(id);
	}

}
