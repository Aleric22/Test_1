package com.esun.espbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esun.espbackend.entity.DeleteEntity;

@Repository
public interface DeleteRepository extends JpaRepository<DeleteEntity, String>{
    
}
