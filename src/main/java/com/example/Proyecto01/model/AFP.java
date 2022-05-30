package com.example.Proyecto01.model;

import lombok.Data; //Lombok

import javax.persistence.*; //JPA

@Data //Lombok
@Entity //JPA
@Table(name = "AFP") //JPA
public class AFP { //JPA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nombres", nullable = false, length = 70)
    private String Nombres;
}
