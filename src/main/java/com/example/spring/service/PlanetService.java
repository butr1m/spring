package com.example.spring.service;

import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;


import java.util.List;

public interface PlanetService {

    public void savePlanet(Planet planet);

    public List<Planet> getPlanets();

    public void deletePlanet(int id);

    public void saveTransferPlanet(Planet planet, Lord lord);

}
