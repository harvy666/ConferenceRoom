package com.example.ConferenceRoom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class CheckBox {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private boolean checked;


}
