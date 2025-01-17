package com.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Challenge;
import com.challenge.repository.ChallengeRepository;
import com.challenge.service.interfaces.ChallengeServiceInterface;

@Service
public class ChallengeService implements ChallengeServiceInterface {

	@Autowired
	private ChallengeRepository challengeRep;
	
	@Override
	public Challenge save(Challenge challenge) {
		return this.challengeRep.save(challenge);
	}

	@Override
	public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
		return this.challengeRep.findByAccelerationsIdAndSubmissionsIdUserId(accelerationId, userId);
	}

}
