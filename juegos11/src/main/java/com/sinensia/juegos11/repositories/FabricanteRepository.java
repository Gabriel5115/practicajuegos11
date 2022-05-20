package com.sinensia.juegos11.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.juegos11.model.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, String>{
	
	@Query("SELECT f FROM Fabricante f")
	List<Fabricante> getAllFabricantes();
	
	
	//void create(Fabricante fabricante);
	
	@Query("SELECT f FROM Fabricante f WHERE f.codigo = :codigo")
	List<Fabricante> getByCodigo(String codigo);
}
