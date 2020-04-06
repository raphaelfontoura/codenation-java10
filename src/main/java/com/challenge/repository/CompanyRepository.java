package com.challenge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.challenge.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {

	List<Company> findDistinctByCandidatesIdAccelerationId(Long accelerationId);
	
	List<Company> findByCandidatesIdUserId(Long userId);
}
