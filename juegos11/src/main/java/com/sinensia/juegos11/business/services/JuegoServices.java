package com.sinensia.juegos11.business.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.sinensia.juegos11.model.Juego;

public interface JuegoServices {
	
	@Query("SELECT j FROM Juego j")
	List<Juego> getAll();
	
	void create(Juego juego);
	
	@Query("SELECT j FROM Juego j WHERE j.codigo = :codigo ")
	Juego read(String codigo);
	
	@Query("SELECT j FROM Juego j WHERE j.fabricante.codigo = :codigo")
	List<Juego> readFabricante(String codigo);

}
