package com.address.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.address.service.dto.Request;
import com.address.service.entity.Address;
import com.address.service.service.AddressService;

@RestController
@RequestMapping(path="/api/address/")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@RequestBody Request request){
      
    	Address address=addressService.saveAddress(request);
    	return new ResponseEntity<>(address,HttpStatus.CREATED);
    	
    	
    }

    @GetMapping("/getById/{Id}")
    public Address getById(@PathVariable("Id") long Id){
       return addressService.getById(Id);
    }

}
