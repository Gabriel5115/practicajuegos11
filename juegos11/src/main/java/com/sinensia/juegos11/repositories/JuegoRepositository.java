package com.sinensia.juegos11.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.sinensia.juegos11.model.Juego;



@Repository
public interface JuegoRepositository extends JpaRepository<Juego, String>{
	
	
	
	@Query("SELECT j FROM Juego j WHERE j.fabricante.codigo = :codigo")
	List<Juego> getJuegosByFabricante(String codigo);
	
}
