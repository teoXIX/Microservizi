package com.myrestaurant.store.PizzaRestaurantService.dataaccessobject;

import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*JPARepository richiede come componenti la classe di riferimento e il tipo della sua PK*/

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
