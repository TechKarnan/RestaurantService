package com.example.restaturant.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.restaturant.entity.RestaurantEntity;
import com.example.restaturant.model.RestaurantModel;

@Mapper
public interface RestaurantMapper {

	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	public RestaurantEntity modeltoEntity (RestaurantModel model);
	public RestaurantModel entitytoModel (RestaurantEntity entity);
	
}
