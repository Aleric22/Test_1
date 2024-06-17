package com.esun.espbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esun.espbackend.entity.SearchEntity;
import com.esun.espbackend.repository.SearchRepository;

@Service
public class SearchService {
	
	@Autowired
	SearchRepository SearchRepo;
	
	public List<SearchEntity> getAll() {
		return SearchRepo.findAll();
	}

}
