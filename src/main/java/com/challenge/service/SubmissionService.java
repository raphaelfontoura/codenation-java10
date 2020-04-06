package com.challenge.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;

@Service
public class SubmissionService implements SubmissionServiceInterface {

	@Autowired
	private SubmissionRepository submissionRep;
	
	@Override
	public Submission save(Submission submission) {
		return this.submissionRep.save(submission);
	}

	@Override
	public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
		return this.findHigherScoreByChallengeId(challengeId);
	}

	@Override
	public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
		return this.submissionRep.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
	}

}
