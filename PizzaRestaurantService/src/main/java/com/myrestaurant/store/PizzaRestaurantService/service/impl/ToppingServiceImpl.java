package com.myrestaurant.store.PizzaRestaurantService.service.impl;

import com.myrestaurant.store.PizzaRestaurantService.dataaccessobject.ToppingRepository;
import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import com.myrestaurant.store.PizzaRestaurantService.service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional /*di Spring, operazioni transazionali per la coerenza*/
@RequiredArgsConstructor /*crea il costruttore solo con le variabili che noi definiamo immutabili (final)*/
public class ToppingServiceImpl implements ToppingService {

    private final ToppingRepository repository;

    @Override
    public Topping save(Topping entity) {
        return repository.save(entity);
    }

    @Override
    public List<Topping> save(List<Topping> entities) {
        return (List<Topping>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Topping> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Topping> findAll() {
        return (List<Topping>)repository.findAll();
    }

    @Override
    public Topping update(Topping entity, Long id) {
        Optional<Topping> optional = findById(id);
        if(optional.isPresent()){
            return save(entity);
        }
        return null;
    }
}
