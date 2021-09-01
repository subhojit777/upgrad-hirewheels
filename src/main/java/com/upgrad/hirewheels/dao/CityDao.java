package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityDao extends JpaRepository<City, Integer> {
    public Optional<City> findByCityName(String cityName);
}
