package com.virtusa.carpooling.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.carpooling.model.*;
public interface LoginRepository extends JpaRepository<Login, Integer>{
	List<Login>  findByEmail(String email);
}
