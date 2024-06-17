package com.esun.espbackend.service;

import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esun.espbackend.entity.UpdateEntity;
import com.esun.espbackend.repository.UpdateRepository;

@Service
public class UpdateService {
	
	@Autowired
	UpdateRepository UpdateRepo;
	
	public UpdateEntity updateProduct(String Product_Name, UpdateEntity updateEntity) {
        UpdateEntity updatedProduct;
        Optional<UpdateEntity> searchEntity = UpdateRepo.findById(Product_Name);
        if (searchEntity.isPresent()) {
            updatedProduct = UpdateRepo.save(updateEntity);
        } else {
            throw new EntityNotFoundException();
        }
        return updatedProduct;
    }

}
