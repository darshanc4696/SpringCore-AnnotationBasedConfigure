package com.tap.ioc.app_impl;

import org.springframework.stereotype.Component;

import com.tap.ioc.add_interfaces.Address;

@Component
public class BangaloreAddress implements Address 
{
	public String address = "Btm Layout, Bangalore";

	@Override
	public String getAddress() 
	{
		return address;
		
	}

}
