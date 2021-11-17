package com.example.spring.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "lords")
public class Lord implements Comparable<Lord> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lord_id")
    private int id;

    @Column(name = "lord_name")
    private String lordName;

    @Column(name = "lord_age")
    private int lordAge;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lord")
    private List<Planet> planetList;


    public Lord() {
    }

    public Lord(String lordName, int lordAge) {
        this.lordName = lordName;
        this.lordAge = lordAge;
    }

    @Override
    public String toString() {
        return " Lord name: " + lordName + " , " + "Lord age: " + lordAge + "\n";
    }

    @Override
    public int compareTo(Lord anotherLord) {
        if (this.getLordAge() == anotherLord.getLordAge()) {
            return 0;
        } else if (this.getLordAge() < anotherLord.getLordAge()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lord lord = (Lord) o;
        return lordAge == lord.lordAge && Objects.equals(lordName, lord.lordName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lordName, lordAge);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLordName() {
        return lordName;
    }

    public void setLordName(String lordName) {
        this.lordName = lordName;
    }

    public int getLordAge() {
        return lordAge;
    }

    public void setLordAge(int lordAge) {
        this.lordAge = lordAge;
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
}