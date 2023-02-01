package com.example.ConferenceRoom.service;

import com.example.ConferenceRoom.entity.CheckBoxData;
import com.example.ConferenceRoom.repository.CheckBoxRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckBoxDataService {

    public CheckBoxRepository checkBoxRepository;

    public CheckBoxDataService(CheckBoxRepository checkBoxRepository) {
        this.checkBoxRepository = checkBoxRepository;
    }

    public CheckBoxData saveCheckBoxData(CheckBoxData checkBoxData) {
        return checkBoxRepository.save(checkBoxData);
    }

    public List<CheckBoxData> getAllCheckBoxData() {
        return checkBoxRepository.findAll();
    }
}
