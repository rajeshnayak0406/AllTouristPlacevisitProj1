package com.nt;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.ControllerClass;
import com.nt.model.TouristPlaceDetails;

@SpringBootApplication
public class AllTouristPlaceDetailsProjApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(AllTouristPlaceDetailsProjApplication.class, args);
	ControllerClass cx= ctx.getBean("Controller1",ControllerClass.class);
	try {
	  List<TouristPlaceDetails> list=cx.takeInputsAndSet();
	  
	  for (TouristPlaceDetails touristPlaceDetails : list) {
		  System.out.println(touristPlaceDetails);
		
	}
	  
	  
	  
	  
	}
	catch(SQLException e) {
		System.out.println("Some inter problems in database exception");
	
		}
	catch(Exception e) {
		System.out.println("Some other exception ");
		
	}
	
	}

}
