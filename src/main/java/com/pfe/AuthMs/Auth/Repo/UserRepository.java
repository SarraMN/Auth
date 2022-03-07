package com.pfe.AuthMs.Auth.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.AuthMs.Auth.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserByEmailAndPassword(String email, String password);
	
	User findUserByEmail(String email);

}