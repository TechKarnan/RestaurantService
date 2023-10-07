package com.example.restaturant.controller;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaturant.model.RestaurantModel;
import com.example.restaturant.service.RestaurantService;

@RestController
@RequestMapping(value = "/rest")
public class Controller {
	
	@Autowired
	RestaurantService restService;

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<RestaurantModel>> getAll(){	
		 List<RestaurantModel> restaurantModel =  restService.getAll();
		 return new ResponseEntity<List<RestaurantModel>>(restaurantModel,org.springframework.http.HttpStatus.ACCEPTED );
	}
}
