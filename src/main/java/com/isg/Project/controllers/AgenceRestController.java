package com.isg.Project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isg.Project.entities.Agence;
import com.isg.Project.services.AgenceService;

@RestController
public class AgenceRestController {
	
	@Autowired
	private AgenceService service;
	
	@RequestMapping(value="/agences", method=RequestMethod.POST)
	public void addAgence(Agence agence) {
		service.addAgence(agence);
	}
    
    @RequestMapping(value="/agences", method=RequestMethod.PUT)
	public void updateAgence(Agence agence) {
		service.updateAgence(agence);
	}
    
    @RequestMapping(value="/agences", method=RequestMethod.DELETE)
	public void deleteAgence(Agence agence) {
		service.deleteAgence(agence);
	}
    
    @RequestMapping(value="/agences", method=RequestMethod.GET)
    public Page<Agence> getAllAgences() {
		return service.getAllAgences(0);
	}

}
