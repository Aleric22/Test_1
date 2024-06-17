package com.esun.espbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esun.espbackend.entity.AddEntity;
import com.esun.espbackend.repository.AddRepository;

@Service
public class AddService {

	@Autowired
	AddRepository userRepo;
	
    public AddEntity createProduct(AddEntity addEntity) {
        return userRepo.save(addEntity);
    }
    
    
}
