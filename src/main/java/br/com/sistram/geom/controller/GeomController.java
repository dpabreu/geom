package br.com.sistram.geom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistram.geom.model.Geom;
import br.com.sistram.geom.repository.GeomRepository;

@RestController
@RequestMapping("/api")
public class GeomController {

	@Autowired
	GeomRepository geomRepository;
	
	@GetMapping("/geom")
	public List<Geom> listaGeom(){
		List<Geom> lista = new ArrayList<Geom>();
		lista = geomRepository.findAll(); 
		return lista; 
	}
}
