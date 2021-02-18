package br.com.sistram.geom.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.locationtech.jts.geom.Point;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.sistram.geom.utils.JsonToPointDeserializer;
import br.com.sistram.geom.utils.PointToJsonSerializer;

@Entity
@Table(name="origem_dados_pontos")
public class OrigemDadosPontos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3364213387754832336L;

	
	private String nomeNavio;
	
//	@Column(columnDefinition = "geometry", name="the_geom")
//	@JsonSerialize(using = PointLatToJsonSerializer.class)
//	@JsonDeserialize(using = JsonToPointDeserializer.class)
	private String lat;
	
//	@Column(columnDefinition = "geometry", name="the_geom")
//	@JsonSerialize(using = PointLonToJsonSerializer.class)
//	@JsonDeserialize(using = JsonToPointDeserializer.class)
	private String lon;
	
	private Double rumo;
	
	private Integer idOrigemDados;
	
	@Column(columnDefinition = "geometry", name="the_geom")
	@JsonSerialize(using = PointToJsonSerializer.class)
	@JsonDeserialize(using = JsonToPointDeserializer.class)
	private Point geom;
	
	private String irin;
	
	private String imo;
	
	private String bandeira;
	
	private String destino;
	
	private Timestamp eta;
	
	private String veloc;
	
	private Timestamp dh;
	
	private String mmsi;
	
	@Id
	private Integer idOrigemDadosPontos;

	public String getNomeNavio() {
		return nomeNavio;
	}

	public void setNomeNavio(String nomeNavio) {
		this.nomeNavio = nomeNavio;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
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

	public Point getGeom() {
		return geom;
	}

	public void setGeom(Point geom) {
		this.geom = geom;
	}

	public String getIrin() {
		return irin;
	}

	public void setIrin(String irin) {
		this.irin = irin;
	}

	public String getImo() {
		return imo;
	}

	public void setImo(String imo) {
		this.imo = imo;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Timestamp getEta() {
		return eta;
	}

	public void setEta(Timestamp eta) {
		this.eta = eta;
	}

	public String getVeloc() {
		return veloc;
	}

	public void setVeloc(String veloc) {
		this.veloc = veloc;
	}

	public Timestamp getDh() {
		return dh;
	}

	public void setDh(Timestamp dh) {
		this.dh = dh;
	}

	public String getMmsi() {
		return mmsi;
	}

	public void setMmsi(String mmsi) {
		this.mmsi = mmsi;
	}

	public Integer getIdOrigemDadosPontos() {
		return idOrigemDadosPontos;
	}

	public void setIdOrigemDadosPontos(Integer idOrigemDadosPontos) {
		this.idOrigemDadosPontos = idOrigemDadosPontos;
	}

}
