package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;

@Service
public class AccelerationService implements AccelerationServiceInterface {

	@Autowired
	private AccelerationRepository accelerationRep;
	
	@Override
	public Acceleration save(Acceleration acceleration) {
		return this.accelerationRep.save(acceleration);
	}

	@Override
	public Optional<Acceleration> findById(Long id) {
		return this.accelerationRep.findById(id);
	}

	@Override
	public List<Acceleration> findByCompanyId(Long companyId) {
		return this.accelerationRep.findByCandidatesIdCompanyId(companyId);
	}

	public Acceleration findByName(String name) {
		return this.accelerationRep.findByName(name);
	}

}
