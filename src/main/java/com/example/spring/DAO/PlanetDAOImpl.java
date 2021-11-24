package com.example.spring.DAO;

import com.example.spring.entity.Planet;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class PlanetDAOImpl implements PlanetDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void savePlanet(Planet planet) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(planet);
    }

    @Override
    public List<Planet> getPlanets() {
        Session session = entityManager.unwrap(Session.class);
        List<Planet> planetList = session.createQuery("from Planet ", Planet.class).getResultList();
        return planetList;
    }

    @Override
    public void deletePlanet(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Planet> query = session.createQuery("delete from Planet where id=:planetId");

        query.setParameter("planetId", id);
        query.executeUpdate();
    }

}
