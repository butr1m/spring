package com.example.spring.DAO;

import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;

import java.util.List;

public interface LordDAO {

    public void saveLords(Lord lord);

    public List<Lord> showUnemployedLords();

    public List<Lord> show10TheYoungestLords();

    public void transferThePlanetToTheLord(Planet planet,Lord lord);
}
