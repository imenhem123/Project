package com.isg.Project.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agence {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idAgence;
	@Column
    private String Nom;
	@Column
    private String PositionGPS;
	
	
	public Agence(String nom, String positionGPS) {
		super();
		this.Nom = nom;
		this.PositionGPS = positionGPS;
	}
	public Agence() {
		super();
	}
	public Long getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPositionGPS() {
		return PositionGPS;
	}
	public void setPositionGPS(String positionGPS) {
		PositionGPS = positionGPS;
	}
  
}
