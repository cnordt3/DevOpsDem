package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Pokemon;

public interface PokemonDAO extends CrudRepository<Pokemon, Integer>{
	
	public List<Pokemon> findAll();
	public Pokemon findByName(String name);

}
