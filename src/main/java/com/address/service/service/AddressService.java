package com.address.service.service;

import com.address.service.dto.Request;
import com.address.service.entity.Address;

public interface AddressService {
	
	Address saveAddress(Request request);

	Address getById(long Id);

}
