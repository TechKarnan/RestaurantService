package com.example.restaturant.service;

import java.util.List;

import com.example.restaturant.entity.RestaurantEntity;
import com.example.restaturant.model.RestaurantModel;

public interface RestaurantService {

	public List<RestaurantModel> getAll();
	
}
