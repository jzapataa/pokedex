package com.cjp.pokedex.services;

import java.util.List;

import com.cjp.pokedex.dto.TypeDto;


public interface IType {

	List<TypeDto> findAll();
	TypeDto findById(int id);
	TypeDto save(TypeDto save);
	void delete(int id);
}
