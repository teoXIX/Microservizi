package com.myrestaurant.store.restaurantservice.controller.impl;

import com.myrestaurant.store.restaurantservice.controller.DriverController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.myrestaurant.store.restaurantservice.service.DriverService;
import com.myrestaurant.store.restaurantservice.mapper.DriverMapper;
import com.myrestaurant.store.restaurantservice.dto.DriverDTO;
import com.myrestaurant.store.restaurantservice.model.Driver;
import java.util.List;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverControllerImpl implements DriverController {

    private final DriverService driverService;

    private final DriverMapper driverMapper;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DriverDTO save(@RequestBody DriverDTO driverDTO) {
        Driver driver = driverMapper.asEntity(driverDTO);
        Driver saved = driverService.save(driver);
        DriverDTO dto = driverMapper.asDTO(saved);
        return dto;
    }

    @Override
    @GetMapping("/{id}")
    public DriverDTO findById(@PathVariable("id") Long id) {
        Driver driver = driverService.findById(id).orElse(null);
        return driverMapper.asDTO(driver);
    }

    @Override
    @DeleteMapping
    public void Delete(@PathVariable("id") Long id) {
        driverService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<DriverDTO> list() {
        List<Driver> drivers = driverService.findAll();
        return driverMapper.asDTOList(drivers);
    }

    @Override
    @PutMapping("/{id}")
    public DriverDTO update(@RequestBody DriverDTO driverDTO, @PathVariable("id") Long id) {
        Driver driver = driverMapper.asEntity(driverDTO);
        return driverMapper.asDTO(driverService.update(driver, id));
    }
}

