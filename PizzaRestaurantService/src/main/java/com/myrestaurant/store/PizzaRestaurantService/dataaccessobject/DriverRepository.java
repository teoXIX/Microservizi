package com.myrestaurant.store.PizzaRestaurantService.dataaccessobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
