package com.esun.espbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esun.espbackend.entity.UpdateEntity;

@Repository
public interface UpdateRepository extends JpaRepository<UpdateEntity, String>{
    
}
