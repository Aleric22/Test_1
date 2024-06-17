package com.esun.espbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.esun.espbackend.service.DeleteService;

@RestController
@CrossOrigin
public class DeleteController {
	@Autowired
	DeleteService deleteService;
	
	@RequestMapping(value = "/DELETE/deleteProduct/{Product_Name}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id") String Product_Name) {
        return deleteService.deleteProduct(Product_Name);
    }

}
