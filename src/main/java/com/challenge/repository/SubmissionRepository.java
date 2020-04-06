package com.challenge.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;

public interface SubmissionRepository extends CrudRepository<Submission, SubmissionId> {
	
	@Query(value = "SELECT * FROM submission s "
			+ "JOIN challenge c ON c.id = s.challenge_id "
			+ "JOIN acceleration a ON a.challenge_id = c.id "
			+ "WHERE c.id = ?1 and a.id = ?2", nativeQuery = true)
	List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);
	
	@Query(value = "SELECT CASE MAX(score) WHEN NULL THEN '0' ELSE MAX(score) FROM submission s "
			+ "WHERE s.challenge_id = ?1", nativeQuery = true)
	BigDecimal findHigherScoreByChallengeId(Long challengeId);

}
