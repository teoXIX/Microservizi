package com.myrestaurant.store.PizzaRestaurantService.dataaccessobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*JPARepository richiede come componenti la classe di riferimento e il tipo della sua PK*/

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {

}
