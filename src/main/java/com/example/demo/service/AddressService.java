package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.repo.IAddRepo;

@Service
public class AddressService {
	
	@Autowired
	IAddRepo iaddRepo;

	public void addAddress(Address address) {
		iaddRepo.save(address);
	}
}
