package com.isg.Project.services;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.isg.Project.dao.ServiceRepository;
import com.isg.Project.dto.ServiceDTO;
import com.isg.Project.entities.Service;

@org.springframework.stereotype.Service
public class ServiceServiceImplement implements ServiceService {

	@Autowired
	private ServiceRepository repository;
	
	@Override
	public void addService(Service service) {
		repository.save(service);
	}

	@Override
	public void updateService(Service service) {
		repository.save(service);
	}

	@Override
	public void deleteService(Service service) {
		repository.delete(service);
	}

	@Override
	public Page<Service> getAllServices(int page) {
		return repository.findAll(new PageRequest(page, 4));
	}

	@Override
	public ServiceDTO convertToDto(Service service) {
		ModelMapper mapper = new ModelMapper();
		ServiceDTO dto = new ServiceDTO();
		mapper.map(service,dto);
	    return dto;
	}

	@Override
	public Service convertToEntity(ServiceDTO dto) {
		ModelMapper mapper = new ModelMapper();
		Service service = new Service();
		mapper.map(dto,service);
	    return service;
	}

}
