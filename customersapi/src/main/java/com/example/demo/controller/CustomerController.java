package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ConfigurationProperties
@RefreshScope
public class CustomerController{

	@Value("${message}")
	 private String message;
	
	public String getMessage() {
		return message;
	}

	@Autowired
	TestClass tc;

	public void setMessage(String message) {
		this.message = message;
	}


	private static List<Customer> list = new ArrayList<Customer>();
	static {
		list.add(new Customer(1,"bipin","bipin@123"));
		list.add(new Customer(2,"Shambhu","shambhu@123"));
		list.add(new Customer(3,"akki","akki@123"));
	}
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public List<Customer> getallCustomers(){
		return list;
	}
	
	
	@RequestMapping(value="/customer",method = RequestMethod.GET)
	public Customer getCustomer(@RequestParam("id") int id){
		Customer customer = null;
		//TestClass tc=new TestClass();
		System.out.println(tc.Msg());
		for(Customer cus : list) {
			if(cus.getId()==id)
				customer = cus;
		}
		return customer;
		
	}
}
