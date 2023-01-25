package com.myrestaurant.store.restaurantservice.controller;

import com.myrestaurant.store.restaurantservice.dto.RestaurantDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Restaurant API")
public interface RestaurantController {

    /*@ApiOperation("Add pizzas to the restaurant")
    public RestaurantDTO addPizzasToRestaurant(@RequestBody RestaurantDTO restaurantDTO);*/

    @ApiOperation("Find all pizzas by restaurant ID")
    public List<Object> getPizzasByRestaurantId(@PathVariable("id") Long restaurantId);

    @ApiOperation("Add new restaurant")
    public RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO);

    @ApiOperation("Find restaurant by ID")
    public RestaurantDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete restaurant by ID")
    public void Delete(@PathVariable("id") Long id);

    @ApiOperation("Find all restaurants")
    public List<RestaurantDTO> list();

    @ApiOperation("Update restaurant")
    public RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO, @PathVariable("id") Long id);

}

