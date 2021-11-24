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
    @Autowired
    private LordDAO lordDAO;

    @Transactional
    @Override
    public void savePlanet(Planet planet) {
        List<String> planetList = planetDAO.getPlanets()
                .stream().map(pl -> pl.getPlanetName())
                .collect(Collectors.toList());
        if (planetList.contains(planet.getPlanetName())) {
        } else {
            planetDAO.savePlanet(planet);
        }
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
    public void saveTransferPlanet(Planet planet, Lord lord) {
        for (Planet pl : planetDAO.getPlanets()) {
            for (Lord ld : lordDAO.getLords()) {
                if (planet.getPlanetName().equals(pl.getPlanetName()) && lord.getLordName().equals(ld.getLordName())) {
                    planet = pl;
                    lord = ld;
                    planet.setLord(ld);
                }
            }
        }
        planetDAO.savePlanet(planet);
    }
}
