package com.cjp.pokedex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.pokedex.entities.Type;

public interface TypeRepository extends JpaRepository<Type, Integer>{
	
	Type findById(int id);

}
