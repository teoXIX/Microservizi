package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.DriverDTO;
import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper extends GenericMapper<Driver, DriverDTO>{
}
