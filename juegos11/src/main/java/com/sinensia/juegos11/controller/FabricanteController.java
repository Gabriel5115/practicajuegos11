package com.sinensia.juegos11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.juegos11.model.Fabricante;
import com.sinensia.juegos11.repositories.FabricanteRepository;

@RestController
public class FabricanteController {
	
	
	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	
	@GetMapping("/fabricantes")
	public List<Fabricante> getAllFabricantes(){
		
		return fabricanteRepository.getAllFabricantes();
	}
	
	/*@GetMapping("/fabricantes/create")
	public void createFabricante(Fabricante fabricante) {
		fabricanteRepository.create(fabricante);
	}*/
	
	
	@GetMapping("/fabricantes/{codigo}")
	public List<Fabricante> getByCodigo(@PathVariable String codigo){
		
		return fabricanteRepository.getByCodigo(codigo);
	}
}
