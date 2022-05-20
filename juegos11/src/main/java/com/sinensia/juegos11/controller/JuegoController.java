package com.sinensia.juegos11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sinensia.juegos11.business.services.JuegoServices;
import com.sinensia.juegos11.model.Juego;
import com.sinensia.juegos11.repositories.JuegoRepositository;

@RestController
public class JuegoController {
	
	@Autowired
	private JuegoServices juegoServices;
	
	@GetMapping("/juegos")
	public List<Juego> getAllJuegos(){
		
		return juegoServices.getAll();
	}
	
	@PostMapping
	public ResponseEntity<?> createdJuego(@RequestBody Juego juego, UriComponentsBuilder uriComponentsBuilder) {
		
		 juegoServices.create(juego);
		
		return ResponseEntity
				.created(uriComponentsBuilder.path("/juegos/{codigo}").build(juego.getCodigo()))
				.build();
		
	
	}
	
	
	@GetMapping("/juegos/{codigo}")
	public Juego getByCodigo(@PathVariable String codigo){
		
		return juegoServices.read(codigo);
	}

	@GetMapping("/juegos/fabricantes/{codigo}")
	public List<Juego> getJuegosByFabricantes(@PathVariable String codigo){
		
		return juegoServices.readFabricante(codigo);
	}
	
}
