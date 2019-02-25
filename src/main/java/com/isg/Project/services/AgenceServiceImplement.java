package com.isg.Project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.isg.Project.dao.AgenceRepository;
import com.isg.Project.dto.AgenceDTO;
import com.isg.Project.entities.Agence;

@Service
public class AgenceServiceImplement implements AgenceService {
	
	@Autowired
	private AgenceRepository repository;
	
	@Override
	public void addAgence(Agence Agence) {
		repository.save(Agence);
	}

	@Override
	public void updateAgence(Agence Agence) {
		repository.save(Agence);
	}

	@Override
	public void deleteAgence(Agence Agence) {
		repository.delete(Agence);
	}

	@Override
	public Page<Agence> getAllAgences(int page) {
		return repository.findAll(new PageRequest(page, 4));
	}

	@Override
	public AgenceDTO convertToDto(Agence Agence) {
		ModelMapper mapper = new ModelMapper();
		AgenceDTO dto = new AgenceDTO();
		mapper.map(Agence,dto);
	    return dto;
	}

	@Override
	public Agence convertToEntity(AgenceDTO dto) {
		ModelMapper mapper = new ModelMapper();
		Agence Agence = new Agence();
		mapper.map(dto,Agence);
	    return Agence;
	}

}
