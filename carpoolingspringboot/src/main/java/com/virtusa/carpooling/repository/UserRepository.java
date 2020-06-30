package com.virtusa.carpooling.repository;
import com.virtusa.carpooling.model.*;
import com.virtusa.carpooling.model.Rider;
import com.virtusa.carpooling.controller.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User, Integer>
{
	List<User>  findByEmail(String email);
	
	
}
