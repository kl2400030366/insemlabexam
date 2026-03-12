package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    
    @Autowired
    private RestaurantService restaurantService;
    
    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }
    
    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
