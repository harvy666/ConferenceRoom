package com.example.ConferenceRoom.repository;


import com.example.ConferenceRoom.entity.CheckBoxData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckBoxRepository extends JpaRepository<CheckBoxData, Integer> {

}
