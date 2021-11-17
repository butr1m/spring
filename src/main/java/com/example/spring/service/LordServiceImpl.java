package com.example.spring.service;

import com.example.spring.DAO.LordDAOImpl;
import com.example.spring.entity.Lord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LordServiceImpl implements LordService {

    @Autowired
    private LordDAOImpl lordDAO;
    @Autowired
    private PlanetServiceImpl planetService;

    @Transactional
    @Override
    public void saveLord(Lord lord) {
        lordDAO.saveLords(lord);
    }

    @Transactional
    @Override
    public List<Lord> showThe10YoungestLord() {

        return lordDAO.show10TheYoungestLords().stream().sorted().limit(5).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<Lord> showUnemployedLords() {
        lordDAO.showUnemployedLords();

        return null;
    }
}
