package com.esun.espbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.esun.espbackend.entity.UpdateEntity;
import com.esun.espbackend.service.UpdateService;

@RestController
@CrossOrigin
public class UpdateController {
	@Autowired
	UpdateService updateService;

	@RequestMapping(value = "/PUT/updateProduct/{Product_Name}", method = RequestMethod.PUT)
    public UpdateEntity updateProduct(@PathVariable(value = "Product_Name") String Product_Name,
            @Valid @RequestBody UpdateEntity updateEnity) {
        return updateService.updateProduct(Product_Name, updateEnity);
    }

}
