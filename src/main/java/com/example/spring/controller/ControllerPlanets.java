package com.example.spring.controller;

import com.example.spring.entity.Lord;
import com.example.spring.entity.Planet;
import com.example.spring.service.LordService;
import com.example.spring.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ControllerPlanets {

    @Autowired
    private PlanetService planetService;

    @Autowired
    private LordService lordService;

    @RequestMapping("/addNewPlanet")
    public String addNewPlanet(Model model) {
        Planet planet = new Planet();
        model.addAttribute("planet", planet);
        return "planet-info";
    }

    @RequestMapping("/savePlanet")
    public String savePlanet(@ModelAttribute("planet") Planet planet) {
        planetService.savePlanet(planet);
        return "redirect:/showInterface";
    }

    @RequestMapping("/showPlanets")
    public String showPlanets(Model model) {
        List<Planet> planetList = planetService.getPlanets();
        model.addAttribute("planetList", planetList);
        return "get-planet";
    }

    @RequestMapping("/destroyPlanet")
    public String destroyPlanet(@RequestParam("planetId") int id) {
        planetService.deletePlanet(id);
        return "redirect:/showInterface";
    }

    @RequestMapping("/transferPlanet")
    public String transferPlanet(Model model) {
        List<Planet> planetList = planetService.getPlanetsWithoutLords();
        List<Lord> lordList = lordService.getLord();
        model.addAttribute("planetListWithoutLords", planetList);
        model.addAttribute("listAllLords", lordList);
        Planet planet=new Planet();
        Lord lord=new Lord();
        model.addAttribute("planetTr",planet);
        model.addAttribute("lordTr",lord);

        return "/transfer-planet";
    }

    @RequestMapping("/saveTransfer")
    public String saveTransfer(@ModelAttribute("planet") Planet planet, @ModelAttribute("lord") Lord lord) {
        planetService.saveTransferPlanet(planet,lord);
        return "redirect:/showInterface";
    }
}
