package com.myrestaurant.store.PizzaRestaurantService.dataaccessobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*JPARepository richiede come componenti la classe di riferimento e il tipo della sua PK*/

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    List<Pizza> findByRestaurantIn(List<Restaurant> restaurants);
}
