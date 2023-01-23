package com.myrestaurant.store.PizzaRestaurantService.service;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;

import java.util.List;

public interface PizzaService extends GenericService<Pizza, Long>{

    List<Pizza> findByRestaurantId(Long restaurantId);

}
