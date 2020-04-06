package com.challenge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.challenge.entity.Acceleration;

public interface AccelerationRepository extends CrudRepository<Acceleration, Long> {

	Acceleration findByName(String name);
	
	List<Acceleration> findByCandidatesIdCompanyId(Long companyId);

}
