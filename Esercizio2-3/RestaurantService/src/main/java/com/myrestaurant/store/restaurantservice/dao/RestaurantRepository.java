package com.myrestaurant.store.restaurantservice.dao;

import com.myrestaurant.store.restaurantservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}