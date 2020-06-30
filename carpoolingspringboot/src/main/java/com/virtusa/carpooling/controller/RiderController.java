package com.virtusa.carpooling.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.carpooling.model.Rider;
import com.virtusa.carpooling.model.User;
import com.virtusa.carpooling.repository.*;
@RestController 
@CrossOrigin(origins = "*")

@RequestMapping("/t/u")
public class RiderController 
{
	 @Autowired
	    private RiderRepository repository;
	   @PostMapping("/rider")
	    public String registration(@RequestBody Rider rider) {
	      repository.save(rider);
	      return "welcome:" + rider.getEmail() + "Rider Registration successfully completed";
	    		
	    }
	    
	    @GetMapping("/getAllRiders")
	    public List<Rider> findAlRiders()
	    {
	        return repository.findAll();
	    }
	   
	    @GetMapping("/findRider/{email}")
	    public List<Rider>findRider(@PathVariable String email) {
	        return repository.findByEmail(email);
	    }
	    @DeleteMapping("/cancel/{id}")
	    public List<Rider> cancelRegistration(@PathVariable int id) {
	        repository.deleteById(id);
	        return repository.findAll();
	   }
	   }

	  

