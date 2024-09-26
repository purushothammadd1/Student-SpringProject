package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;
@RestController
public class AddressController {
	
	@Autowired
	AddressService addressServ;

	@PostMapping("address")
	public void addAddress(@RequestBody Address address) {
		addressServ.addAddress(address);
	}
}
