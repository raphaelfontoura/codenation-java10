package com.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.challenge.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
