package com.esun.espbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.esun.espbackend.entity.AddEntity;
import com.esun.espbackend.service.AddService;

@RestController
@CrossOrigin
public class AddController {
	@Autowired
	AddService addService;
	
	@RequestMapping(value = "/POST/add", method = RequestMethod.POST)
    public AddEntity createProduct(@Valid @RequestBody AddEntity addEntity) {
        return addService.createProduct(addEntity);
    }

}
