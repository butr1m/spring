package com.example.spring.service;

import com.example.spring.entity.Lord;

import java.util.List;

public interface LordService {

public void saveLord(Lord lord);

public List<Lord> showUnemployedLords();

public List<Lord> showThe10YoungestLord();


}
