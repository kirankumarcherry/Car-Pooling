package com.virtusa.carpooling.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.virtusa.carpooling.model.Login;
import com.virtusa.carpooling.model.User;
import com.virtusa.carpooling.repository.*;
@RestController 
@CrossOrigin(origins = "*")

@RequestMapping("/l/u")
public class LoginController {
	 @Autowired
	    private LoginRepository repository;
	   @PostMapping("/logindetails")
	    public String registration(@RequestBody Login login) {
	      repository.save(login);
	      return "welcome" + login.getEmail() + " " + "login process successfully completed";
	     
	    }
	   
	     
}
