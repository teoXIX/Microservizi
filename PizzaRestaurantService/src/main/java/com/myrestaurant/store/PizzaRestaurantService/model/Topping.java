package com.myrestaurant.store.PizzaRestaurantService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "toppings")
public class Topping implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topping_id")
    private Long id;

    @NotBlank
    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "toppings")
    @JsonIgnore
    /*toppings nome variabile nella classe Pizza dopo many to many*/
    private Set<Pizza> pizzas = new HashSet<>();
}
