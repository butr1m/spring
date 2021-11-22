package com.example.spring.service;

import com.example.spring.DAO.LordDAOImpl;
import com.example.spring.DAO.PlanetDAOImpl;
import com.example.spring.entity.Lord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LordServiceImpl implements LordService {

    @Autowired
    private LordDAOImpl lordDAO;
    @Autowired
    private PlanetDAOImpl planetDAO;

    @Transactional
    @Override
    public void saveLord(Lord lord) {
        lordDAO.saveLords(lord);
    }

    @Override
    public List<Lord> getLord() {
        return lordDAO.getLords();
    }

    @Transactional
    @Override
    public List<Lord> showThe10YoungestLord() {

        return lordDAO.getLords().stream().sorted().limit(5).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<Lord> showUnemployedLords () {
        List<Lord> result=new ArrayList<>();
        List<Integer> list=planetDAO.getPlanets().stream().map(lord -> lord.getLord().getId()).collect(Collectors.toList());
        for(Lord l:lordDAO.getLords()){
            if(list.contains(l.getId())){
            }else {
                result.add(l);
            }
        }
        return result;

    }
}
