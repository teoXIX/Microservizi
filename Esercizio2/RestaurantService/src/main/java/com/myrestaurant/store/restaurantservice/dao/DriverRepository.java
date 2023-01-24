package com.myrestaurant.store.restaurantservice.dao;

import com.myrestaurant.store.restaurantservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
