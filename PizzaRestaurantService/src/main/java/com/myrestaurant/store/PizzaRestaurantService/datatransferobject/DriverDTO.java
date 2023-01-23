package com.myrestaurant.store.PizzaRestaurantService.datatransferobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class DriverDTO {

    private Long id;

    private String name;

    private Set<Restaurant> restaurants = new HashSet<>();

}
