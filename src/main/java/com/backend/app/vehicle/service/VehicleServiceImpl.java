package com.backend.app.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.app.vehicle.dao.VehicleDao;
import com.backend.app.vehicle.entity.vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao dao;
	@Override
	@Transactional(readOnly = true)
	public List<vehicle> findAll() {
		return (List<vehicle>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public vehicle findById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
}
