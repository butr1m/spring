package com.example.spring.controller;

import com.example.spring.entity.Lord;
import com.example.spring.service.LordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerLords {

    @Autowired
    private LordService lordService;

    @RequestMapping("/showInterface")
    public String showInterface() {
        return "show-interface";
    }

    @RequestMapping("/addNewLord")
    public String addNewLord(Model model) {
        Lord lord = new Lord();
        model.addAttribute("lord", lord);
        return "lord-info";
    }

    @RequestMapping("/saveLord")
    public String saveLord(@ModelAttribute("lord") Lord lord) {
        lordService.saveLord(lord);
        return "redirect:/showInterface";
    }

    @RequestMapping("/theYoungestLords")
    public String show10TheYoungestLords(Model model) {
        List<Lord> listTheYoungestLords = lordService.showThe10YoungestLord();
        model.addAttribute("listTheYoungestLords", listTheYoungestLords);
        return "get-youngest-lords";
    }

    @RequestMapping("/showUnemployedLords")
    public String showUnemployedLords(Model model) {
        List<Lord> listUnemployedLords = lordService.showUnemployedLords();
        model.addAttribute("unemployedLords", listUnemployedLords);
        return "/get-unemployeed-lords";
    }


}
