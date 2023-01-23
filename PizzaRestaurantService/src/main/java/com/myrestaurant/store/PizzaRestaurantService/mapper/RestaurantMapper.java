package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.RestaurantDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDTO>{
}
