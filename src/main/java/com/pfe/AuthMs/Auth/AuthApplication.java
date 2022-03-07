package com.pfe.AuthMs.Auth;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pfe.AuthMs.Auth.Entity.Role;
import com.pfe.AuthMs.Auth.Entity.User;
import com.pfe.AuthMs.Auth.Repo.RoleRepository;
import com.pfe.AuthMs.Auth.Repo.UserRepository;
import com.pfe.AuthMs.Auth.Services.UserService;



@SpringBootApplication
public class AuthApplication {

	
	
	  @Autowired UserRepository userRepo;
	  @Autowired RoleRepository roleRepo;

	
	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	
	
	  @PostConstruct protected void init() {
	  
			
			  List<Role> Roles =new ArrayList<>();
			  Role r= new Role(null,"Admin");	
			  roleRepo.save(r);
			  Roles.add(r);
			 
	  //authorityList.add(createAuthority("ADMIN","Admin role"));
	  
	  User user= new User(null, "sarra", "mannai", "sarra", "1234",Roles);
	  
	  userRepo.save(user);
	  
	  
	 
	}


	
}
