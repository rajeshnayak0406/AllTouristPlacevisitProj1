package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ITouristDao;
import com.nt.model.TouristPlaceDetails;
@Service
public class ServiceImplClass implements IServiceClass {
	
	@Autowired
	ITouristDao dao;
	
	@Override
	public List<TouristPlaceDetails> fetchDataFromController(String state1, String state2, String state3) throws Exception {
		List<TouristPlaceDetails> listimpl=dao.setallState(state1, state2, state3);
		
		
		return listimpl;
		
	}

}
