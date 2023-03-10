package com.myrestaurant.store.PizzaRestaurantService.datatransferobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class RestaurantDTO {

    private Long id;

    private String name;

    private String address;

    private String city;

    private Set<Driver> drivers;

    private Set<Pizza> pizzas;

}
