package com.myrestaurant.store.PizzaRestaurantService.service.impl;

import com.myrestaurant.store.PizzaRestaurantService.dataaccessobject.DriverRepository;
import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import com.myrestaurant.store.PizzaRestaurantService.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepository repository;

    @Override
    public Driver save(Driver entity) {
        return repository.save(entity);
    }

    @Override
    public List<Driver> save(List<Driver> entities) {
        return (List<Driver>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Driver> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Driver> findAll() {
        return (List<Driver>)repository.findAll();
    }

    @Override
    public Driver update(Driver entity, Long id) {
        Optional<Driver> optional = findById(id);
        if(optional.isPresent()){
            return save(entity);
        }
        return null;
    }
}
