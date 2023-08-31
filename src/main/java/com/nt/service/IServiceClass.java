package com.nt.service;

import java.util.List;

import com.nt.model.TouristPlaceDetails;

public interface IServiceClass {
	List<TouristPlaceDetails> fetchDataFromController(String state1,String state2,String state3) throws Exception;
	

}
