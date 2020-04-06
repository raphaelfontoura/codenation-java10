package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.challenge.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query(value = "SELECT * FROM acceleration a "
			+ "JOIN candidate c ON c.acceleration_id = a.id "
			+ "JOIN users u ON u.id = c.user_id "
			+ "WHERE a.name = ?1" ,nativeQuery = true)
	List<User> findByAccelerationName(String accelerationName);
	
	List<User> findByCandidatesIdCompanyId(Long companyId);
	
}
