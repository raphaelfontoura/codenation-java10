package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.repository.CandidateRepository;
import com.challenge.service.interfaces.CandidateServiceInterface;

@Service
public class CandidateService implements CandidateServiceInterface {
	
	@Autowired
	private CandidateRepository candidateRep;

	@Override
	public Candidate save(Candidate candidate) {
		return this.candidateRep.save(candidate);
	}

	@Override
	public Optional<Candidate> findById(CandidateId id) {
		return this.candidateRep.findById(id);
	}

	@Override
	public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> findByAccelerationId(Long accelerationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
