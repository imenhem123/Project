package com.isg.Project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	@Column
    private String NomService;
	@Column
	private String file;
	
	
	public Service() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomService() {
		return NomService;
	}
	public void setNomService(String nomService) {
		NomService = nomService;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Service(String nomService, String file) {
		super();
		NomService = nomService;
		this.file = file;
	}
}
