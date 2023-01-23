package com.myrestaurant.store.PizzaRestaurantService.controller.impl;

import com.myrestaurant.store.PizzaRestaurantService.controller.RestaurantController;
import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.RestaurantDTO;
import com.myrestaurant.store.PizzaRestaurantService.mapper.RestaurantMapper;
import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import com.myrestaurant.store.PizzaRestaurantService.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
@RequiredArgsConstructor
public class RestaurantControllerImpl implements RestaurantController{

    private final RestaurantMapper restaurantMapper;

    private final RestaurantService restaurantService;


    @Override
    @PostMapping("/addPizzas")
    @ResponseStatus(HttpStatus.CREATED)
    public RestaurantDTO addPizzasToRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantMapper.asEntity(restaurantDTO);
        return restaurantMapper.asDTO(restaurantService.addPizzasToRestaurant(restaurant));
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantMapper.asEntity(restaurantDTO);
        Restaurant saved = restaurantService.save(restaurant);
        RestaurantDTO dto = restaurantMapper.asDTO(saved);
        return dto;
    }

    @Override
    @GetMapping("/{id}")
    public RestaurantDTO findById(@PathVariable("id") Long id) {
        Restaurant restaurant = restaurantService.findById(id).orElse(null);
        return restaurantMapper.asDTO(restaurant);
    }

    @Override
    @DeleteMapping
    public void Delete(@PathVariable("id") Long id) {
        restaurantService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<RestaurantDTO> list() {
        List<Restaurant> restaurants = restaurantService.findAll();
        return restaurantMapper.asDTOList(restaurants);
    }

    @Override
    @PutMapping("/{id}")
    public RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO, @PathVariable("id") Long id) {
        Restaurant restaurant = restaurantMapper.asEntity(restaurantDTO);
        return restaurantMapper.asDTO(restaurantService.update(restaurant, id));
    }
}
