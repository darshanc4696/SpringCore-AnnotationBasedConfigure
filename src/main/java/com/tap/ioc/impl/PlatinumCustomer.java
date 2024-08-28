package com.tap.ioc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.ioc.add_interfaces.Address;
import com.tap.ioc.interfaces.Customer;


@Component("pc")
public class PlatinumCustomer implements Customer 
{
	String name;
	String type;
	Address address;
	

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(@Qualifier("hyderabadAdress") Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Autowired
	public void setName(@Value("Darshan") String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	
	@Autowired
	public void setType(@Value("Platinum Customer") String type) {
		this.type = type;
	}

	@Override
	public void customerDetails() 
	{
		System.out.println(name+" is a "+ type +","+address.getAddress());
	}
}