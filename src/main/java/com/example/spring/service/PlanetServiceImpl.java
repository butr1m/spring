package com.example.spring.service;

import com.example.spring.DAO.LordDAO;
import com.example.spring.DAO.PlanetDAO;
import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetDAO planetDAO;

    @Autowired
    private LordDAO lordDAO;

    private Lord lord;

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
    public void deletePlanet(int id) {
        planetDAO.deletePlanet(id);
    }

    @Transactional
    @Override
    public void transferPlanet(Planet planet, Lord lord) {

        if (!planetDAO.getPlanet().contains(planet.getPlanetName())){
            System.out.println("Такая планета не существует");
        }else if(planetDAO.getPlanet().contains(planet.getPlanetName()) && !planetDAO.getPlanet().contains(lord.getId())){
            planet.setLord(lord);
            System.out.println("Планета передана поселитею");
        }else{
            System.out.println("У панеты уже есть повелитель");
        }

    }

    @Override
    public List<Lord> showUnemployedLords() {

        List<Lord> lordList=lordDAO.getLords();
        List<Planet> planetList=planetDAO.getPlanet();








        return null;
    }

}
