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
@Table(name="geom")
public class Geom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8326185114782441715L;

	@Id
	private Integer mmsi;
	
	private Timestamp dh;

	@Column(columnDefinition = "geometry", name="geom")
	@JsonSerialize(using = PointToJsonSerializer.class)
	@JsonDeserialize(using = JsonToPointDeserializer.class)
	private Point geom;

	public Point getGeom() {
		return geom;
	}

	public void setGeom(Point geom) {
		this.geom = geom;
	}

	public Integer getMmsi() {
		return mmsi;
	}

	public void setMmsi(Integer mmsi) {
		this.mmsi = mmsi;
	}

	public Timestamp getDh() {
		return dh;
	}

	public void setDh(Timestamp dh) {
		this.dh = dh;
	}
}
