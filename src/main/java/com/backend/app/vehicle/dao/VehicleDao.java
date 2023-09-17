package com.backend.app.vehicle.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.app.vehicle.entity.vehicle;

public interface VehicleDao extends CrudRepository<vehicle, Long>{

}
