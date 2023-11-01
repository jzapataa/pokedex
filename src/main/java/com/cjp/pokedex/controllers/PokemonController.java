package com.cjp.pokedex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.pokedex.dto.PokemonDto;
import com.cjp.pokedex.services.IPokemon;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@Autowired
	private IPokemon pokemonService;
	
	@GetMapping("/list")
	public ResponseEntity<?> listPokemon(){
		return ResponseEntity.ok().body(pokemonService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable int id){
		return ResponseEntity.ok().body(pokemonService.findById(id));
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody PokemonDto pokemonDto){
		return ResponseEntity.ok().body(pokemonService.save(pokemonDto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@PathVariable int id, @RequestBody PokemonDto pokemonDto){
		return ResponseEntity.ok().body(pokemonService.save(pokemonDto));
	}
	
	
	

}
