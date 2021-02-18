package br.com.sistram.geom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistram.geom.dto.OrigemDadosPontosDto;
import br.com.sistram.geom.model.OrigemDadosPontos;
import br.com.sistram.geom.repository.OrigemDadosPontosRepository;

@RestController
@RequestMapping("/api")
public class OrigemDadosPontosController {

	@Autowired
	OrigemDadosPontosRepository origemDadosPontosRepository;
	
	@GetMapping("/naviosFontes")
	public List<OrigemDadosPontosDto> listaOrigemDadosPontos(
			@RequestParam(value = "fonte", required = true) Integer idOrigemDados){
		
		List<OrigemDadosPontos> lista = new ArrayList<OrigemDadosPontos>();
		List<OrigemDadosPontosDto> listaDto = new ArrayList<OrigemDadosPontosDto>();
		
		if(idOrigemDados==55){
			lista = origemDadosPontosRepository.findByAreasOrigemDados();
		}else{
			lista = origemDadosPontosRepository.findByIdOrigemDados(idOrigemDados);
		}
		for (OrigemDadosPontos entity : lista) {
			OrigemDadosPontosDto dto = new OrigemDadosPontosDto(entity);
			listaDto.add(dto);
		}
		
		return listaDto; 
	}
}
