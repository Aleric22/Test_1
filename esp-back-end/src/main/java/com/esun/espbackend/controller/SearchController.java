package com.esun.espbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.esun.espbackend.entity.SearchEntity;
import com.esun.espbackend.service.SearchService;

@RestController
@CrossOrigin
public class SearchController {
	@Autowired
	SearchService searchService;
	
	@RequestMapping(value = "/GET/search")
	public List<SearchEntity> getAll(@RequestHeader (name="Authorization") String token) {
		if (token.equals("manager") || token.equals("teller"))
			return searchService.getAll();
		else
			throw new NoResultException();
    }
	
}
