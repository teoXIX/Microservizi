package com.myrestaurant.store.PizzaRestaurantService.controller;

import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.ToppingDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Topping API")
public interface ToppingController {

    @ApiOperation("Add new topping")
    public ToppingDTO save(@RequestBody ToppingDTO toppingDTO);

    @ApiOperation("Find topping by ID")
    public ToppingDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete topping by ID")
    public void Delete(@PathVariable("id") Long id);

    @ApiOperation("Find all toppings")
    public List<ToppingDTO> list();

    @ApiOperation("Update topping")
    public ToppingDTO update(@RequestBody ToppingDTO toppingDTO, @PathVariable("id") Long id);

}
