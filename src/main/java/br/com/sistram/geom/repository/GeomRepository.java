package br.com.sistram.geom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistram.geom.model.Geom;

public interface GeomRepository extends JpaRepository<Geom, Integer>{

}
