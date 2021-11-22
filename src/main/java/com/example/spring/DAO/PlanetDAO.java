package com.example.spring.DAO;

import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;

import java.util.List;

public interface PlanetDAO {

    public void savePlanet(Planet planet);

    public List<Planet> getPlanets();

    public void deletePlanet(int  id);



}
