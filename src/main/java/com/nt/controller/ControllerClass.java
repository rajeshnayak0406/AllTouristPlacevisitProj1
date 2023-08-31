package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.TouristPlaceDetails;
import com.nt.service.IServiceClass;
@Controller("Controller1")
public class ControllerClass {
	@Autowired
	IServiceClass is;
	
	public List<TouristPlaceDetails> takeInputsAndSet() throws Exception{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter state1");
		String state1=sc.next().toUpperCase();
		
		System.out.println("Enter state2");
		String state2=sc.next().toUpperCase();
		
		System.out.println("Enter state3");
		String state3=sc.next().toUpperCase();
		
		
		
		List<TouristPlaceDetails> impl=is.fetchDataFromController(state1, state2, state3);
		return impl;
		
		
		
		
	}
	
	
	

}
