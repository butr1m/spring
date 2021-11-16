package com.example.spring.service;

import com.example.spring.DAO.PlanetDAO;
import com.example.spring.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService{

    @Autowired
    private PlanetDAO planetDAO;

    @Transactional
    @Override
    public void savePlanet(Planet planet) {
        planetDAO.savePlanet(planet);
    }

    @Transactional
    @Override
    public List<Planet> getPlanet() {
        return planetDAO.getPlanet();
    }

    @Transactional
    @Override
    public void deletePlanet(int  id) {
        planetDAO.deletePlanet(id);
    }
}
