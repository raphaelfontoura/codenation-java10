package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.User;
import com.challenge.repository.UserRepository;
import com.challenge.service.interfaces.UserServiceInterface;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepository userRep;
	
	@Override
	public User save(User user) {
		return this.userRep.save(user);
	}

	@Override
	public Optional<User> findById(Long userId) {
		return this.userRep.findById(userId);
	}

	@Override
	public List<User> findByAccelerationName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
