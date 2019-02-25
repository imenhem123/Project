package com.isg.Project.dto;

public class ServiceDTO {
	
    private String NomService;
	private String file;
	
	public ServiceDTO() {
		super();
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

}
