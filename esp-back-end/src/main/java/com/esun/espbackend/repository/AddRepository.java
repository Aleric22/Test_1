package com.esun.espbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esun.espbackend.entity.AddEntity;

@Repository
public interface AddRepository extends JpaRepository<AddEntity, String>{
    
}
