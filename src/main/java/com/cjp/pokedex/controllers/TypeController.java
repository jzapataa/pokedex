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

import com.cjp.pokedex.dto.TypeDto;
import com.cjp.pokedex.services.IType;

@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private IType typeService;
	
	@GetMapping("/list")
	public ResponseEntity<?> listTypes(){
		return ResponseEntity.ok().body(typeService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable int id){
		return ResponseEntity.ok().body(typeService.findById(id));
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody TypeDto typeDto){
		return ResponseEntity.ok().body(typeService.save(typeDto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@PathVariable int id, @RequestBody TypeDto typeDto){
		return ResponseEntity.ok().body(typeService.save(typeDto));
	}
}
