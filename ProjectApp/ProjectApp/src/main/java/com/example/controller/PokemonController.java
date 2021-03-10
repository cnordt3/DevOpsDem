package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Pokemon;
import com.example.repo.PokemonDAO;
@CrossOrigin(origins = "*")
@Controller("PokemonController")
public class PokemonController {
	
	private PokemonDAO pkd;
	
	public PokemonController() {
		super();
	}
	
	@Autowired
	public PokemonController(PokemonDAO pkd) {
		this.pkd=pkd;
	}
	
	@GetMapping("/Allpoke")
	public @ResponseBody List<Pokemon> allPoke(){
		return pkd.findAll();
	}
	
	@GetMapping("/OnePoke/{name}")
	public @ResponseBody Pokemon onePoke(@PathVariable("name") String name) {
		Pokemon poke = pkd.findByName(name);
		return poke;
	}
	
	@PostMapping("/new/{name}/{id}/{type}/{hp}")
	public @ResponseBody String newPoke(@PathVariable("name") String name, @PathVariable("id") int id,
			@PathVariable("type") String type, @PathVariable("hp") int hp) {
		Pokemon poke = new Pokemon(id,name,type,hp);
		pkd.save(poke);
		return "Saved";
	}
	

}
