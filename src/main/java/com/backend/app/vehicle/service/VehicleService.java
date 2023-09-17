package com.backend.app.vehicle.service;

import java.util.List;

import com.backend.app.vehicle.entity.vehicle;

public interface VehicleService {

	public List<vehicle> findAll();
	
	public vehicle findById(Long id);
}
