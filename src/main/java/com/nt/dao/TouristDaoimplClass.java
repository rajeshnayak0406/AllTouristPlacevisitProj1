package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.TouristPlaceDetails;



@Repository("DAOImplClass")

public class TouristDaoimplClass implements ITouristDao {
	
	public static final String query="SELECT  DISTRICT,PLACE,DOP,DISTANCE_FROM_CAPITAL FROM TOURISIM WHERE STATE IN(?,?,?)";
	
	
	@Autowired
	DataSource ds;
	@Override
	public List<TouristPlaceDetails> setallState(String state1, String state2, String state3) throws Exception {
		// TODO Auto-generated method stub
		
		List<TouristPlaceDetails> listimp=null;
		
		
		try(Connection con= ds.getConnection();
				
				PreparedStatement ps=con.prepareStatement(query) ;

				){
			
			ps.setString(1, state1);
			ps.setString(2, state2);
			ps.setString(3, state3);
			
			ResultSet res= ps.executeQuery();
			
			listimp=new ArrayList<>();
			while(res.next()) {
				
				TouristPlaceDetails tl= new TouristPlaceDetails();
				tl.setDistrict(res.getString(1));
				tl.setPalce(res.getString(2));
				tl.setDOP(String.valueOf(res.getDate(3)));
				tl.setDistance_From_Capital(res.getInt(4));
				
				listimp.add(tl);
	
			}
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw e;
			
		}
		
		catch(Exception ea) {
			ea.printStackTrace();
			throw ea;
			
		}
		
		
		
		
		return listimp;
		
		
		
		
		
		
	}
	
	

}
