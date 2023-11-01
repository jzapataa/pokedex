package com.cjp.pokedex.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjp.pokedex.dto.TypeDto;
import com.cjp.pokedex.mapper.TypeMapper;
import com.cjp.pokedex.repositories.TypeRepository;
import com.cjp.pokedex.services.IType;

@Service
public class TypeServiceImpl implements IType{
	
	@Autowired
	private TypeRepository typeRepository;
	
	@Autowired
	private TypeMapper typeMapper;

	@Override
	@Transactional(readOnly = true)
	public List<TypeDto> findAll() {
		return typeMapper.transformToDto(typeRepository.findAll());
	}

	@Override
	public TypeDto findById(int id) {
		return typeMapper.transformToDto(typeRepository.findById(id));
	}

	@Override
	public TypeDto save(TypeDto typeDto) {
		return typeMapper.transformToDto(typeRepository.save(typeMapper.transformToPojo(typeDto)));
	}

	@Override
	public void delete(int id) {
		typeRepository.deleteById(id);
		
	}

}
