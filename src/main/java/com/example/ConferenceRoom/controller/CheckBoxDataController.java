package com.example.ConferenceRoom.controller;

import com.example.ConferenceRoom.entity.CheckBoxData;
import com.example.ConferenceRoom.service.CheckBoxDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")

public class CheckBoxDataController {

    public CheckBoxDataService checkBoxDataService;

    public CheckBoxDataController(CheckBoxDataService checkBoxDataService) {
        this.checkBoxDataService = checkBoxDataService;
    }
//
//    @GetMapping()
//    public String getIndex() {
//        return "index";
//    }

//TODO maybe good solution?

    @GetMapping()
    public ModelAndView getData() {
        List<CheckBoxData> data = checkBoxDataService.getAllCheckBoxData();
        ModelAndView mav = new ModelAndView();
        mav.addObject("data", data);
        mav.setViewName("index");
        return mav;
    }
}
