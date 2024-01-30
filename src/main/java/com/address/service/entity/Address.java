package com.address.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="address")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
    private String street;
    private String city;
    private int  postalcode; 

}
