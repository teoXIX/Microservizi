package com.myrestaurant.store.restaurantservice.service;

import com.myrestaurant.store.restaurantservice.model.Restaurant;

import java.util.List;

public interface RestaurantService extends GenericService<Restaurant, Long>{

    List<Restaurant> findAll();

    Restaurant addPizzasToRestaurant(Restaurant restaurant);

}