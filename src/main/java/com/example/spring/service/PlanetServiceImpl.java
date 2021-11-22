package com.example.spring.service;

import com.example.spring.DAO.LordDAO;
import com.example.spring.DAO.PlanetDAO;
import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetDAO planetDAO;


    @Transactional
    @Override
    public void savePlanet(Planet planet) {
        List<String> planetList=planetDAO.getPlanets().stream().map(pl -> pl.getPlanetName()).collect(Collectors.toList());
        if(planetList.contains(planet.getPlanetName())){
        }
        else {planetDAO.savePlanet(planet);}

    }

    @Transactional
    @Override
    public List<Planet> getPlanets() {
        return planetDAO.getPlanets();
    }

    @Transactional
    @Override
    public void deletePlanet(int id) {
        planetDAO.deletePlanet(id);
    }

    @Transactional
    @Override
    public List<Lord> showUnemployedLords() {

        return null;
    }

    @Transactional
    @Override
    public void saveTransferPlanet(Planet planet, Lord lord) {
        planet.setLord(lord);
        planetDAO.savePlanet(planet);
    }

    @Transactional
    @Override
    public List<Planet> getPlanetsWithoutLords() {

        return planetDAO.getPlanets().stream().filter(planet -> planet.getLord() == null).collect(Collectors.toList());
    }

}
