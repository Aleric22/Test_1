package com.esun.espbackend.service;

import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.esun.espbackend.entity.DeleteEntity;
import com.esun.espbackend.repository.DeleteRepository;

@Service
public class DeleteService {
	
	@Autowired
	DeleteRepository DeleteRepo;
	
    public ResponseEntity<Object> deleteProduct(String Product_Name) {
        Optional<DeleteEntity> deleteEntity = DeleteRepo.findById(Product_Name);
        if (deleteEntity.isPresent()) {
            DeleteEntity Transaction = deleteEntity.get();
            DeleteRepo.delete(Transaction);
        } else {
            throw new EntityNotFoundException();
        }
        return ResponseEntity.ok().build();
    }
    

}
