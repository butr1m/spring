package com.example.spring.service;

import com.example.spring.entity.Planet;

import java.util.List;

public interface PlanetService {

    public void savePlanet(Planet planet);

    public List<Planet> getPlanet();

    public void deletePlanet(int  id);


}