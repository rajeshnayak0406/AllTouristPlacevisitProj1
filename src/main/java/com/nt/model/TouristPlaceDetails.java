package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TouristPlaceDetails {
	private String District;
	private String place;
	private String DOP;
	private Integer Distance_From_Capital;
	

}
