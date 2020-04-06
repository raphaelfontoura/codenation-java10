package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepository;
import com.challenge.service.interfaces.CompanyServiceInterface;

@Service
public class CompanyService implements CompanyServiceInterface {

	@Autowired
	private CompanyRepository companyRep;
	
	@Override
	public Company save(Company company) {
		return this.companyRep.save(company);
	}

	@Override
	public Optional<Company> findById(Long id) {
		return this.companyRep.findById(id);
	}

	@Override
	public List<Company> findByAccelerationId(Long accelerationId) {
		return this.companyRep.findDistinctByCandidatesIdAccelerationId(accelerationId);
	}

	@Override
	public List<Company> findByUserId(Long userId) {
		return this.companyRep.findByCandidatesIdUserId(userId);
	}

}
