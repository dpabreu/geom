package br.com.sistram.geom.dto;

import org.locationtech.jts.geom.Point;

import br.com.sistram.geom.model.OrigemDadosPontos;

public class OrigemDadosPontosDto {
	
	private String lon;
	private String lat;
	private String mmsi;
	private String nomeNavio;
	private Double rumo;
	private Integer idOrigemDados;
	
	public OrigemDadosPontosDto(){}
	
	public OrigemDadosPontosDto(OrigemDadosPontos entity){
		
		Point geom = entity.getGeom();
		
		this.lon = Double.toString(geom.getX());
		this.lat = Double.toString(geom.getY());
		this.mmsi = entity.getMmsi();
		this.nomeNavio = entity.getNomeNavio();
		this.rumo = entity.getRumo();
		this.idOrigemDados = entity.getIdOrigemDados();
	}
	
	
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getMmsi() {
		return mmsi;
	}
	public void setMmsi(String mmsi) {
		this.mmsi = mmsi;
	}
	public String getNomeNavio() {
		return nomeNavio;
	}
	public void setNomeNavio(String nomeNavio) {
		this.nomeNavio = nomeNavio;
	}
	public Double getRumo() {
		return rumo;
	}
	public void setRumo(Double rumo) {
		this.rumo = rumo;
	}
	public Integer getIdOrigemDados() {
		return idOrigemDados;
	}
	public void setIdOrigemDados(Integer idOrigemDados) {
		this.idOrigemDados = idOrigemDados;
	}
}
