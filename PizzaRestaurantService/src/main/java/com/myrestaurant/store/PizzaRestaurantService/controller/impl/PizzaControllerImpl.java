package com.myrestaurant.store.PizzaRestaurantService.controller.impl;

import com.myrestaurant.store.PizzaRestaurantService.controller.PizzaController;
import com.myrestaurant.store.PizzaRestaurantService.datatransferobject.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.mapper.PizzaMapper;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import com.myrestaurant.store.PizzaRestaurantService.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
@RequiredArgsConstructor
public class PizzaControllerImpl implements PizzaController {

    private final PizzaService pizzaService;

    private final PizzaMapper pizzaMapper;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        Pizza saved = pizzaService.save(pizza);
        PizzaDTO dto = pizzaMapper.asDTO(saved);
        return dto;
    }

    @Override
    @GetMapping("/{id}")
    public PizzaDTO findById(@PathVariable("id") Long id) {
        Pizza pizza = pizzaService.findById(id).orElse(null);
        return pizzaMapper.asDTO(pizza);
    }

    @Override
    @DeleteMapping
    public void Delete(@PathVariable("id") Long id) {
        pizzaService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<PizzaDTO> list() {
        List<Pizza> pizzas = pizzaService.findAll();
        return pizzaMapper.asDTOList(pizzas);
    }

    @Override
    @PutMapping("/{id}")
    public PizzaDTO update(@RequestBody PizzaDTO pizzaDTO, @PathVariable("id") Long id) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        return pizzaMapper.asDTO(pizzaService.update(pizza, id));
    }
}
