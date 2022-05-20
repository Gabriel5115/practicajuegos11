package com.sinensia.juegos11.business.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.juegos11.business.services.JuegoServices;
import com.sinensia.juegos11.model.Juego;
import com.sinensia.juegos11.repositories.JuegoRepositository;

@Service
public class JuegoServicesImpl implements JuegoServices{
	
	@Autowired
	private JuegoRepositository juegoRepositository;
	
	@Override
	public List<Juego> getAll() {
		return juegoRepositository.findAll();
	}

	@Override
	public void create(Juego juego) {
		juegoRepositository.save(juego);
		
	}

	@Override
	public Juego read(String codigo) {
		Optional<Juego> optional = juegoRepositository.findById(codigo);
		return optional.isPresent()? optional.get() : null;
	}

	@Override
	public List<Juego> readFabricante(String codigo) {
		
		return juegoRepositository.getJuegosByFabricante(codigo);
		
	}
	
}
