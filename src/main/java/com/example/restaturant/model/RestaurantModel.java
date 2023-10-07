package com.example.restaturant.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestaurantModel {

	private Integer id;
	private String name;
	private String address;
	private String city;
	private String restaurantdes;
	
	public RestaurantModel() {
		
	}
}
