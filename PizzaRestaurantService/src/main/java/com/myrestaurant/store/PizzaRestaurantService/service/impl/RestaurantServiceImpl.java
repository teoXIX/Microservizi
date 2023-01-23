package com.myrestaurant.store.PizzaRestaurantService.service.impl;

import com.myrestaurant.store.PizzaRestaurantService.dataaccessobject.RestaurantRepository;
import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import com.myrestaurant.store.PizzaRestaurantService.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;

    @Override
    public Restaurant save(Restaurant entity) {
        return repository.save(entity);
    }

    @Override
    public List<Restaurant> save(List<Restaurant> entities) {
        return (List<Restaurant>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Restaurant> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Restaurant> findAll() {
        return (List<Restaurant>)repository.findAll();
    }

    @Override
    public Restaurant update(Restaurant entity, Long id) {
        Optional<Restaurant> optional = findById(id);
        if(optional.isPresent()){
            return save(entity);
        }
        return null;
    }
}
