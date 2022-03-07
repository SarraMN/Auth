package com.pfe.AuthMs.Auth.Services;

import java.util.List;

import com.pfe.AuthMs.Auth.Entity.Role;
import com.pfe.AuthMs.Auth.Entity.User;

public interface UserService {
	
	public User add(User user);
	
	public User getUserByEmailAndPassword(String email, String password);

	public List<User> getUsers();
	
	public Role add(Role role);
}
