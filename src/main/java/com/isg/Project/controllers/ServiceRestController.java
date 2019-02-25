package com.isg.Project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isg.Project.entities.Service;
import com.isg.Project.services.ServiceService;


@RestController
public class ServiceRestController {
	
	@Autowired
	private ServiceService service;
	
	@RequestMapping(value="/services", method=RequestMethod.POST)
	public void addService(Service Service) {
		service.addService(Service);
	}
    
    @RequestMapping(value="/services", method=RequestMethod.PUT)
	public void updateService(Service Service) {
		service.updateService(Service);
	}
    
    @RequestMapping(value="/services", method=RequestMethod.DELETE)
	public void deleteService(Service Service) {
		service.deleteService(Service);
	}
    
    @RequestMapping(value="/services", method=RequestMethod.GET)
    public Page<Service> getAllservices() {
		return service.getAllServices(0);
	}
}
