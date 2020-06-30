package com.virtusa.carpooling.repository;
import com.virtusa.carpooling.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.virtusa.carpooling.controller.*;
public interface RiderRepository extends JpaRepository<Rider, Integer>
{
	List<Rider>  findByEmail(String email);
}
