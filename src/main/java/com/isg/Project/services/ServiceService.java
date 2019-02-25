package com.isg.Project.services;

import org.springframework.data.domain.Page;

import com.isg.Project.dto.ServiceDTO;
import com.isg.Project.entities.Service;

public interface ServiceService {
	
	public void addService(Service Service);
	public void updateService(Service Service);
	public void deleteService(Service Service);
	public Page<Service> getAllServices(int page);
	public ServiceDTO convertToDto(Service Service);
	public Service convertToEntity(ServiceDTO dto);

}
