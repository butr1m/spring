package com.example.spring.DAO;

import com.example.spring.entity.Lord;

import java.util.List;

public interface LordDAO {

    public void saveLords(Lord lord);

    public List<Lord> getLords();

}
