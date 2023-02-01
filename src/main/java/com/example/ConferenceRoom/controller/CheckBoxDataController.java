package com.example.ConferenceRoom.controller;

import com.example.ConferenceRoom.service.CheckBoxDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class CheckBoxDataController {

    public CheckBoxDataService checkBoxDataService;

    public CheckBoxDataController(CheckBoxDataService checkBoxDataService) {
        this.checkBoxDataService = checkBoxDataService;
    }

    @GetMapping()
    public String getIndex() {
        return "index";
    }
}
