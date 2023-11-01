package com.cjp.pokedex.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;

import com.cjp.pokedex.dto.PokemonDto;
import com.cjp.pokedex.dto.TypeDto;
import com.cjp.pokedex.entities.Pokemon;
import com.cjp.pokedex.entities.Type;

@Component
public class PokemonMapper implements ModelMapper<Pokemon, PokemonDto> {

	@Override
	public PokemonDto transformToDto(Pokemon entity) {
		PokemonDto dto = new PokemonDto();
		if (entity != null) {
			dto.setAttack(entity.getAttack());
			dto.setDefense(entity.getDefense());
			dto.setDescription(entity.getDescription());
			dto.setDualtype(entity.isDualtype());
			dto.setHP(entity.getHP());
			dto.setIDpoke(entity.getIDpoke());
			dto.setPokename(entity.getPokename());
			dto.setSpattack(entity.getSpattack());
			dto.setSpdefense(entity.getSpdefense());
			dto.setSpeed(entity.getSpeed());
			
			TypeDto firstTypeDto = new TypeDto();
			TypeDto secondTypeDto = new TypeDto();
			
			if(entity.getFirstType() != null) {
				firstTypeDto.setIDType(entity.getFirstType().getIDType());
				firstTypeDto.setTypename(entity.getFirstType().getTypename());
			}
			
			if(entity.getSecondType() != null) {
				secondTypeDto.setIDType(entity.getSecondType().getIDType());
				secondTypeDto.setTypename(entity.getSecondType().getTypename());
			}
			
			dto.setFirstType(firstTypeDto);
			dto.setSecondType(secondTypeDto);

		}
		return dto;
	}

	@Override
	public Pokemon transformToPojo(PokemonDto dto) throws ParseException {
		Pokemon entity = new Pokemon();
		if (dto != null) {
			entity.setAttack(dto.getAttack());
			entity.setDefense(dto.getDefense());
			entity.setDescription(dto.getDescription());
			entity.setDualtype(dto.isDualtype());
			entity.setHP(dto.getHP());
			entity.setIDpoke(dto.getIDpoke());
			entity.setPokename(dto.getPokename());
			entity.setSpattack(dto.getSpattack());
			entity.setSpdefense(dto.getSpdefense());
			entity.setSpeed(dto.getSpeed());
			
			Type firstType = new Type();
			Type secondType = new Type();
			
			if(dto.getFirstType() != null) {
				firstType.setIDType(dto.getFirstType().getIDType());
				firstType.setTypename(dto.getFirstType().getTypename());
			}
			
			if(dto.getSecondType() != null) {
				secondType.setIDType(dto.getSecondType().getIDType());
				secondType.setTypename(dto.getSecondType().getTypename());
			}
			
			entity.setFirstType(firstType);
			entity.setSecondType(secondType);

		}
		return entity;
	}

	@Override
	public List<PokemonDto> transformToDto(List<Pokemon> entities) {
		List<PokemonDto> listDto = new ArrayList<>();

		if (entities != null && !entities.isEmpty()) {
			for (Pokemon entity : entities) {
				listDto.add(transformToDto(entity));
			}
		}
		return listDto;
	}

	@Override
	public List<Pokemon> transformToPojo(List<PokemonDto> dtos) throws ParseException {
		List<Pokemon> listPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (PokemonDto dto : dtos) {
				listPojo.add(transformToPojo(dto));
			}
		}
		return listPojo;
	}

	@Override
	public Set<PokemonDto> transformSetToDto(Set<Pokemon> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pokemon> transformSetToPojo(Set<PokemonDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PokemonDto> transformToDto(Page<Pokemon> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Pokemon> transformToPojo(Page<PokemonDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
