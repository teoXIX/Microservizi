package com.myrestaurant.store.pizzaservice.mapper;

import java.util.List;

public interface GenericMapper <E, D>{

    E asEntity(D dto);

    D asDTO(E entity);

    List<E> asEntity(List<D> dtoList);

    List<D> asDTOList(List<E> entityList);

}
