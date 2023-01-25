package com.myrestaurant.store.restaurantservice.dto;

import com.myrestaurant.store.restaurantservice.model.Restaurant;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class DriverDTO {

    private Long id;

    private String name;

    private Set<Restaurant> restaurants;

}
