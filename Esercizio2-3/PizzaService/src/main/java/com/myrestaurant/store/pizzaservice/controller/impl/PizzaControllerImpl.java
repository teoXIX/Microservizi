package com.myrestaurant.store.pizzaservice.controller.impl;

import com.myrestaurant.store.pizzaservice.controller.PizzaController;
import com.myrestaurant.store.pizzaservice.dto.RestaurantIdsDTO;
import com.myrestaurant.store.pizzaservice.mapper.RestaurantIdsMapper;
import com.myrestaurant.store.pizzaservice.model.RestaurantIds;
import com.myrestaurant.store.pizzaservice.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.myrestaurant.store.pizzaservice.mapper.PizzaMapper;
import com.myrestaurant.store.pizzaservice.dto.PizzaDTO;
import com.myrestaurant.store.pizzaservice.model.Pizza;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
@RequiredArgsConstructor
public class PizzaControllerImpl implements PizzaController {

    private final PizzaService pizzaService;
    private final RestaurantIdsMapper restaurantIdsMapper;
    private final PizzaMapper pizzaMapper;

    @Override
    @PostMapping("/restaurant")
    public List<PizzaDTO> addPizzaToRestaurant(List<RestaurantIdsDTO> restaurantIdsDTOS) {
        List<RestaurantIds> restaurantIds = restaurantIdsMapper.asEntity(restaurantIdsDTOS);
        return pizzaMapper.asDTOList(pizzaService.addPizzasToRestaurant(restaurantIds));
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        return pizzaMapper.asDTO(pizzaService.save(pizza));
    }


    @Override
    @GetMapping("/{id}")
    public PizzaDTO findById(@PathVariable("id") Long id) {
        Pizza pizza = pizzaService.findById(id).orElse(null);
        return pizzaMapper.asDTO(pizza);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        pizzaService.deleteByid(id);
    }

    @Override
    @GetMapping("/restaurant/{id}")
    public List<PizzaDTO> findByRestaurantId(@PathVariable("id")Long restaurantId) {
        List<Pizza> pizzas = pizzaService.findByRestaurantId(restaurantId);
        return pizzaMapper.asDTOList(pizzas);
    }

    @Override
    @GetMapping("/lista")
    public List<PizzaDTO> list() {
        return pizzaMapper.asDTOList(pizzaService.findAll());
    }

    @Override
    @PutMapping({"/{id}"})
    public PizzaDTO update(@RequestBody PizzaDTO pizzaDTO, @PathVariable("id") Long id) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        return pizzaMapper.asDTO(pizzaService.update(pizza, id));

    }

}
