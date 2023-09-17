package com.backend.app.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.app.vehicle.entity.vehicle;
import com.backend.app.vehicle.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService microService;
	
	//Def endpoints
	@GetMapping("/list")
	public List<vehicle> list(){
		
		return microService.findAll();
	}
	
	@GetMapping("/vehice/(id)")
	public vehicle detail(@PathVariable Long id) {
		return microService.findById(id);
	}
}
