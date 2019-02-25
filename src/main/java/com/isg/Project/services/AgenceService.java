package com.isg.Project.services;

import org.springframework.data.domain.Page;

import com.isg.Project.dto.AgenceDTO;
import com.isg.Project.entities.Agence;

public interface AgenceService {
	
	public void addAgence(Agence Agence);
	public void updateAgence(Agence Agence);
	public void deleteAgence(Agence Agence);
	public Page<Agence> getAllAgences(int page);
	public AgenceDTO convertToDto(Agence Agence);
	public Agence convertToEntity(AgenceDTO dto);

}
