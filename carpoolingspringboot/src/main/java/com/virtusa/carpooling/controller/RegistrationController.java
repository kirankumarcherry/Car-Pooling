package com.virtusa.carpooling.controller;
import com.virtusa.carpooling.repository.*;
import com.virtusa.carpooling.exception.*;
import com.virtusa.carpooling.model.*;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
@CrossOrigin(origins = "*")

@RequestMapping("/r/u")
public class RegistrationController 
{

	 @Autowired
	    private UserRepository repository;
	
	   @PostMapping("/register")
	  
	   public String registration(@RequestBody User user1)
	   {
	  repository.save(user1);
	  return "welcome" + " "  + user1.getEmail() + " " +     "you have been successfully registered";
	   }
	   
	   
	    @GetMapping("/getAllUsers")
	    public List<User> findAllUsers()
	    {
	        return repository.findAll();
	      
	    }
	   
	  
	    @GetMapping("/findUser/{email}")
	    public List<User> findUser(@PathVariable String email) {
	        return repository.findByEmail(email);
	    }

	   @DeleteMapping("/cancel/{id}")
	    public List<User> cancelRegistration(@PathVariable int id) {
	        repository.deleteById(id);
	        return repository.findAll();
	   }

	  

}
