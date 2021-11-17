package com.example.spring.DAO;

import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LordDAOImpl implements LordDAO {
    @Autowired
    private EntityManager entityManager;


    @Override
    public void saveLords(Lord lord) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(lord);
    }

    @Override
    public List<Lord> show10TheYoungestLords() {
        Session session = entityManager.unwrap(Session.class);
        List<Lord> lordList = session.createQuery("from Lord ", Lord.class).getResultList();
        return lordList;
    }

    @Override
    public List<Lord> showUnemployedLords() {
        Session session = entityManager.unwrap(Session.class);
        List<Lord> lordList = session.createQuery("from Lord ", Lord.class).getResultList();
        return lordList;
    }

    @Override
    public void transferThePlanetToTheLord(Planet planet, Lord lord) {
        Session session=entityManager.unwrap(Session.class);

    }


}
