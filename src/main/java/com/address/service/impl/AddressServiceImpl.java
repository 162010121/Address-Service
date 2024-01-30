package com.address.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.service.dto.Request;
import com.address.service.entity.Address;
import com.address.service.repository.AddressRepository;
import com.address.service.service.AddressService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Request request) {

		Address address = new Address();
		address.setCity(request.getCity());
		address.setStreet(request.getStreet());
		address.setPostalcode(request.getPostalcode());
		addressRepository.save(address);

		return address;

	}

	@Override
	public Address getById(long Id) {

		log.info("inside getById" + Id);

		Address address = addressRepository.findById(Id).get();

		return address;
	}

}
