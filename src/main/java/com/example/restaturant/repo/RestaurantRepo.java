package com.example.restaturant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restaturant.entity.RestaurantEntity;

@Repository
public interface RestaurantRepo extends JpaRepository<RestaurantEntity, Integer> {

	
}
