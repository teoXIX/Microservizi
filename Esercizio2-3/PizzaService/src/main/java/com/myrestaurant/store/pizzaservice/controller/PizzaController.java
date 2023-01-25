package com.myrestaurant.store.pizzaservice.controller;

import com.myrestaurant.store.pizzaservice.dto.PizzaDTO;
import com.myrestaurant.store.pizzaservice.dto.RestaurantIdsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Pizza API")
public interface PizzaController {

    @ApiOperation("Add pizza to restaurant")
    public List<PizzaDTO> addPizzaToRestaurant(@RequestBody List<RestaurantIdsDTO> restaurantIdsDTOS);

    @ApiOperation("Add new pizza")
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO);

    @ApiOperation("find pizza by ID")
    public PizzaDTO findById(@PathVariable("id")Long id);

    @ApiOperation("Delete by ID")
    public void delete(@PathVariable("id")Long id);


    @ApiOperation("find all pizza")
    public List<PizzaDTO> list();

    @ApiOperation("Update Pizza")
    public PizzaDTO update(@RequestBody PizzaDTO pizza, @PathVariable("id")Long id);

    @ApiOperation("find pizza by ID")
    public List<PizzaDTO> findByRestaurantId(@PathVariable("id")Long restaurantId);

}
