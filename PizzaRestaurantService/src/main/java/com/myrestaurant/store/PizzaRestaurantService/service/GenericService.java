package com.myrestaurant.store.PizzaRestaurantService.service;

import java.util.*;

public interface GenericService<E, M>{
    E save(E entity);

    List<E> save(List<E> entities);

    void deleteBYìyId(M id);

    Optional<E> findById(M id);

    List<E> findAll();

    E update(E entity, M id);

}
