package com.au.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public void sampleMethod(String name) {
		System.out.println("From Service : " + name);
		
		if(name.equals("messi")) {
			throw new RuntimeException();
		}
	}
}
