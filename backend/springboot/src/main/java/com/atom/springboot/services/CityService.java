package com.atom.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atom.springboot.entities.City;
import com.atom.springboot.repositories.CityRepository;

@Service
public class CityService {
    @Autowired CityRepository cityRepository;

    public CityService(){

    }

    public List<City> getCities(){
        return cityRepository.findAll();
    }


    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public City getCity(String cityname) {
        return cityRepository.findByCityname(cityname);
    }
}

