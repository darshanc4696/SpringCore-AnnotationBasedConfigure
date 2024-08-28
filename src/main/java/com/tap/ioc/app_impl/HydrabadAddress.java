package com.tap.ioc.app_impl;

import org.springframework.stereotype.Component;

import com.tap.ioc.add_interfaces.Address;

@Component
public class HydrabadAddress implements Address 
{
	public String address = "Ameerapet, Hyderabad";
	
	@Override
	public String getAddress() 
	{
		return address;
		
	}

}
