package com.example.Proyecto01.model;

import lombok.Data; //Lombok

import javax.persistence.*; //JPA

@Data //Lombok
@Entity //JPA
@Table(name = "RegistrationRequest") //JPA
public class RegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DNI", nullable = false, length = 8)
    private Integer DNI;

    @Column(name = "Monto_Retiro", nullable = false)
    private Double Monto_Retiro;

    @Column(name = "Id_AFP", nullable = false, length = 2)
    private Integer Id_AFP;
}
