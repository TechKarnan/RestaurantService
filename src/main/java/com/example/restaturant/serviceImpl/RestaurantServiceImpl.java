package com.example.restaturant.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaturant.entity.RestaurantEntity;
import com.example.restaturant.mapper.RestaurantMapper;
import com.example.restaturant.model.RestaurantModel;
import com.example.restaturant.repo.RestaurantRepo;
import com.example.restaturant.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepo restRepo;
	
	@Autowired
	private ModelMapper model ;
	
	@Override
	public List<RestaurantModel> getAll() {
		List<RestaurantEntity> restList = restRepo.findAll();	
		//List<RestaurantModel> restModel = restList.stream().map((data)->this.model.map(data,RestaurantModel.class)).collect(Collectors.toList());
		List<RestaurantModel> restModel = restList.stream().map((data)->RestaurantMapper.INSTANCE.entitytoModel(data)).collect(Collectors.toList());
		return restModel;
		
	}

}
