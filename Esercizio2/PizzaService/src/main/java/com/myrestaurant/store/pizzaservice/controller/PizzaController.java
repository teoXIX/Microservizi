package com.myrestaurant.store.pizzaservice.controller;

import com.myrestaurant.store.pizzaservice.dto.PizzaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Pizza API")
public interface PizzaController {

    /*@ApiOperation("Find pizzas by Restaurant ID")
    public List<PizzaDTO> findByRestaurantId(@PathVariable("id") Long restaurantId);*/

    @ApiOperation("Add new pizza")
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO);

    @ApiOperation("Find pizza by ID")
    public PizzaDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete pizza by ID")
    public void Delete(@PathVariable("id") Long id);

    @ApiOperation("Find all pizzas")
    public List<PizzaDTO> list();

    @ApiOperation("Update pizza")
    public PizzaDTO update(@RequestBody PizzaDTO pizzaDTO, @PathVariable("id") Long id);
}
