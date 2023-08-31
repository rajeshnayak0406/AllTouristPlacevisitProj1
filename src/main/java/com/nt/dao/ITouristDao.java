package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.TouristPlaceDetails;

public interface ITouristDao {
	public List<TouristPlaceDetails>setallState(String state1, String state2,String state3) throws Exception;
	

}
