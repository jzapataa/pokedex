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
public class TypeMapper implements ModelMapper<Type, TypeDto>{

	@Override
	public TypeDto transformToDto(Type entity) {
		TypeDto dto = new TypeDto();
		
		if(entity != null) {
			dto.setIDType(entity.getIDType());
			dto.setTypename(entity.getTypename());
			
			List<PokemonDto> pokemonsWithFirstTypeList = new ArrayList<>();
			PokemonDto pokemonsWithFirstType = new PokemonDto();
			
			if(entity.getPokemonsWithFirstType() != null || !entity.getPokemonsWithFirstType().isEmpty()) {
				for(int i = 0; i<entity.getPokemonsWithFirstType().size(); i++) {
					pokemonsWithFirstType.setAttack(entity.getPokemonsWithFirstType().get(i).getAttack());
					pokemonsWithFirstType.setDefense(entity.getPokemonsWithFirstType().get(i).getDefense());
					pokemonsWithFirstType.setDescription(entity.getPokemonsWithFirstType().get(i).getDescription());
					pokemonsWithFirstType.setDualtype(entity.getPokemonsWithFirstType().get(i).isDualtype());
					pokemonsWithFirstType.setHP(entity.getPokemonsWithFirstType().get(i).getHP());
					pokemonsWithFirstType.setIDpoke(entity.getPokemonsWithFirstType().get(i).getIDpoke());
					pokemonsWithFirstType.setPokename(entity.getPokemonsWithFirstType().get(i).getPokename());
					pokemonsWithFirstType.setSpattack(entity.getPokemonsWithFirstType().get(i).getSpattack());
					pokemonsWithFirstType.setSpdefense(entity.getPokemonsWithFirstType().get(i).getSpdefense());
					pokemonsWithFirstType.setSpeed(entity.getPokemonsWithFirstType().get(i).getSpeed());
					
					pokemonsWithFirstTypeList.add(pokemonsWithFirstType);
				}
			
			}
			
			List<PokemonDto> pokemonsWithSecondTypeList = new ArrayList<>();
			PokemonDto pokemonsWithSecondType = new PokemonDto();
			
			if(entity.getPokemonsWithSecondType() != null || !entity.getPokemonsWithSecondType().isEmpty()) {
				for(int i = 0; i<entity.getPokemonsWithSecondType().size(); i++) {
					pokemonsWithSecondType.setAttack(entity.getPokemonsWithSecondType().get(i).getAttack());
					pokemonsWithSecondType.setDefense(entity.getPokemonsWithSecondType().get(i).getDefense());
					pokemonsWithSecondType.setDescription(entity.getPokemonsWithSecondType().get(i).getDescription());
					pokemonsWithSecondType.setDualtype(entity.getPokemonsWithSecondType().get(i).isDualtype());
					pokemonsWithSecondType.setHP(entity.getPokemonsWithSecondType().get(i).getHP());
					pokemonsWithSecondType.setIDpoke(entity.getPokemonsWithSecondType().get(i).getIDpoke());
					pokemonsWithSecondType.setPokename(entity.getPokemonsWithSecondType().get(i).getPokename());
					pokemonsWithSecondType.setSpattack(entity.getPokemonsWithSecondType().get(i).getSpattack());
					pokemonsWithSecondType.setSpdefense(entity.getPokemonsWithSecondType().get(i).getSpdefense());
					pokemonsWithSecondType.setSpeed(entity.getPokemonsWithSecondType().get(i).getSpeed());
					
					pokemonsWithSecondTypeList.add(pokemonsWithSecondType);
				}
			
			}
			
			dto.setPokemonsWithFirstType(pokemonsWithFirstTypeList);
			dto.setPokemonsWithSecondType(pokemonsWithSecondTypeList);
		}
		return dto;
	}

	@Override
	public Type transformToPojo(TypeDto dto) throws ParseException {
		
		Type entity = new Type();
		
		if(dto != null) {
			entity.setIDType(dto.getIDType());
			entity.setTypename(dto.getTypename());
			
			List<Pokemon> pokemonsWithFirstTypeList = new ArrayList<>();
			Pokemon pokemonsWithFirstType = new Pokemon();
			
			if(dto.getPokemonsWithFirstType() != null) {
				for(int i = 0; i<dto.getPokemonsWithFirstType().size(); i++) {
					pokemonsWithFirstType.setAttack(dto.getPokemonsWithFirstType().get(i).getAttack());
					pokemonsWithFirstType.setDefense(dto.getPokemonsWithFirstType().get(i).getDefense());
					pokemonsWithFirstType.setDescription(dto.getPokemonsWithFirstType().get(i).getDescription());
					pokemonsWithFirstType.setDualtype(dto.getPokemonsWithFirstType().get(i).isDualtype());
					pokemonsWithFirstType.setHP(dto.getPokemonsWithFirstType().get(i).getHP());
					pokemonsWithFirstType.setIDpoke(dto.getPokemonsWithFirstType().get(i).getIDpoke());
					pokemonsWithFirstType.setPokename(dto.getPokemonsWithFirstType().get(i).getPokename());
					pokemonsWithFirstType.setSpattack(dto.getPokemonsWithFirstType().get(i).getSpattack());
					pokemonsWithFirstType.setSpdefense(dto.getPokemonsWithFirstType().get(i).getSpdefense());
					pokemonsWithFirstType.setSpeed(dto.getPokemonsWithFirstType().get(i).getSpeed());
					
					pokemonsWithFirstTypeList.add(pokemonsWithFirstType);
				}
			
			}
			
			List<Pokemon> pokemonsWithSecondTypeList = new ArrayList<>();
			Pokemon pokemonsWithSecondType = new Pokemon();
			
			if(dto.getPokemonsWithSecondType() != null) {
				for(int i = 0; i<dto.getPokemonsWithFirstType().size(); i++) {
					pokemonsWithSecondType.setAttack(dto.getPokemonsWithSecondType().get(i).getAttack());
					pokemonsWithSecondType.setDefense(dto.getPokemonsWithSecondType().get(i).getDefense());
					pokemonsWithSecondType.setDescription(dto.getPokemonsWithSecondType().get(i).getDescription());
					pokemonsWithSecondType.setDualtype(dto.getPokemonsWithSecondType().get(i).isDualtype());
					pokemonsWithSecondType.setHP(dto.getPokemonsWithSecondType().get(i).getHP());
					pokemonsWithSecondType.setIDpoke(dto.getPokemonsWithSecondType().get(i).getIDpoke());
					pokemonsWithSecondType.setPokename(dto.getPokemonsWithSecondType().get(i).getPokename());
					pokemonsWithSecondType.setSpattack(dto.getPokemonsWithSecondType().get(i).getSpattack());
					pokemonsWithSecondType.setSpdefense(dto.getPokemonsWithSecondType().get(i).getSpdefense());
					pokemonsWithSecondType.setSpeed(dto.getPokemonsWithSecondType().get(i).getSpeed());
					
					pokemonsWithSecondTypeList.add(pokemonsWithSecondType);
				}
			
			}
			
			entity.setPokemonsWithFirstType(pokemonsWithFirstTypeList);
			entity.setPokemonsWithSecondType(pokemonsWithSecondTypeList);
		}


		return entity;
	}

	@Override
	public List<TypeDto> transformToDto(List<Type> entities) {
		List<TypeDto> listDto = new ArrayList<>();

		if (entities != null && !entities.isEmpty()) {
			for (Type entity : entities) {
				listDto.add(transformToDto(entity));
			}
		}
		return listDto;
	}

	@Override
	public List<Type> transformToPojo(List<TypeDto> dtos) throws ParseException {
		List<Type> listPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (TypeDto dto : dtos) {
				listPojo.add(transformToPojo(dto));
			}
		}
		return listPojo;
	}

	@Override
	public Set<TypeDto> transformSetToDto(Set<Type> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Type> transformSetToPojo(Set<TypeDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TypeDto> transformToDto(Page<Type> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Type> transformToPojo(Page<TypeDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
