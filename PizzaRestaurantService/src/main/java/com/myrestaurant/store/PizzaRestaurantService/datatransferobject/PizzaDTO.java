package com.myrestaurant.store.PizzaRestaurantService.datatransferobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import lombok.*;
import java.util.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class PizzaDTO {
    private Long id;
    private String name;
    private boolean favorite;
    private Set<Topping> toppings = new HashSet<>();
}
