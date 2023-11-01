package com.cjp.pokedex.mapper;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.expression.ParseException;

public interface ModelMapper<T, Z> {

	public Z transformToDto(T entity);

	public T transformToPojo(Z dto) throws ParseException;

	public List<Z> transformToDto(List<T> entities);

	public List<T> transformToPojo(List<Z> dto) throws ParseException;

	public Set<Z> transformSetToDto(Set<T> entities);

	public Set<T> transformSetToPojo(Set<Z> dto);

	public Page<Z> transformToDto(Page<T> entities);

	public Page<T> transformToPojo(Page<Z> dto);

}
