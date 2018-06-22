package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="random")
@Component
public class TestClass {
	
	    @Value("${message}")
		 private String message;
		
		//@RequestMapping(value="/Message",method=RequestMethod.GET)
		public String Msg() {
			return message;
		}

}
