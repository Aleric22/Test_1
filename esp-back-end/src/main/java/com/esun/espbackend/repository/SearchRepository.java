package com.esun.espbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esun.espbackend.entity.SearchEntity;


public interface SearchRepository extends JpaRepository<SearchEntity, String>{
    
}
