package com.tap.ioc.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.ioc.impl.GoldCustomer;
import com.tap.ioc.impl.PlatinumCustomer;

public class App 
{
  public static void main(String[] args) 
  {
	  ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
	  
	  GoldCustomer gc = (GoldCustomer) cx.getBean("gc");
	  PlatinumCustomer pc = (PlatinumCustomer) cx.getBean("pc");
	  
	  
	  gc.customerDetails();
	  pc.customerDetails();
  }
}
