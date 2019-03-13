package com.player.pl.boundary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.player.pl.entity.Partie;

public interface PartieRepository extends JpaRepository<Partie,String>{
	
	
}
