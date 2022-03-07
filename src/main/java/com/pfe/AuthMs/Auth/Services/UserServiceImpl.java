package com.pfe.AuthMs.Auth.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pfe.AuthMs.Auth.Entity.Role;
import com.pfe.AuthMs.Auth.Entity.User;
import com.pfe.AuthMs.Auth.Repo.RoleRepository;
import com.pfe.AuthMs.Auth.Repo.UserRepository;




@Service 
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	//@Autowired
	//private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User add(User user) {
		//String password = user.getPassword();
    	//user.setPassword(bCryptPasswordEncoder.encode(password));
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findUserByEmailAndPassword(email, password);
	}
	
	
	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public Role add(Role role) {
		
		return roleRepository.save(role);
	}
	
	

}