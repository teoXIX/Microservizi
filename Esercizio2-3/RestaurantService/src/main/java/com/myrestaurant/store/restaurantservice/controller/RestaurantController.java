package com.myrestaurant.store.restaurantservice.controller;

import com.myrestaurant.store.restaurantservice.dto.RestaurantDTO;
import com.myrestaurant.store.restaurantservice.dto.RestaurantIdsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Restaurant API")
public interface RestaurantController {

    @ApiOperation("add pizzas to the restaurant")
    public List<Object> addPizzasToRestaurant(@RequestBody List<RestaurantIdsDTO> restaurantIdsDTOS);

    @ApiOperation("Add new Restaurant")
    public RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO);

    @ApiOperation("find Restaurant by ID")
    public RestaurantDTO findById(@PathVariable("id")Long id);

    @ApiOperation("Delete by ID")
    public void delete(@PathVariable("id")Long id);

    @ApiOperation("find all Restaurant")
    public List<RestaurantDTO> list();

    @ApiOperation("Update Restaurant")
    public RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO, @PathVariable("id")Long id);

    @ApiOperation("get pizzas by Restaurant")
    public List<Object>GetPizzasByRestaurantId(@RequestBody Long restaurantId);

}

