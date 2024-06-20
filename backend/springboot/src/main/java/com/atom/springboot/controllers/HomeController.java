package com.atom.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.atom.springboot.entities.City;
import com.atom.springboot.services.CityService;


@RestController
public class HomeController {
    
    @Autowired
    CityService cityService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";
    }

    @GetMapping("getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }

    @PostMapping("addcity")
    public City SaveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getCity(String cityname){
        return cityService.getCity(cityname);
    }
 }