package com.tap.ioc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.ioc.add_interfaces.Address;
import com.tap.ioc.interfaces.Customer;


@Component("gc")
public class GoldCustomer implements Customer 
{
	String name;
	String type;	
	Address address;

	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(@Qualifier("bangaloreAddress") Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Autowired
	public void setName(@Value("Indresh") String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	
	@Autowired
	public void setType(@Value("Gold Customer") String type) {
		this.type = type;
	}

	@Override
	public void customerDetails() 
	{
		System.out.println(name+" is a "+ type +","+address.getAddress());
	}

}
