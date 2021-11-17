package com.example.spring.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planet_id")
    private int id;

    @Column(name = "planet_name")
    private String planetName;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="lord_id")
    private Lord lord;


    public Planet() {
    }

    public Planet(String planetName) {
        this.planetName = planetName;
    }

    @Override
    public String toString() {
        return "Имя планеты: " + planetName + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(planetName, planet.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public Lord getLord() {
        return lord;
    }

    public void setLord(Lord lord) {
        this.lord = lord;
    }
}