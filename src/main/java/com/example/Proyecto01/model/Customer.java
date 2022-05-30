package com.example.Proyecto01.model;

import lombok.Data; //Lombok

import javax.persistence.*; //JPA

@Data //Lombok
@Entity //JPA
@Table(name = "Customer") //JPA
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nombres", nullable = false, length = 70)
    private String Nombres;

    @Column(name = "Apellidos", nullable = false, length = 70)
    private String Apellidos;

    @Column(name = "DNI", nullable = false, length = 8)
    private Integer DNI;

    @Column(name = "Telefono", nullable = false, length = 70)
    private Integer Telefono;

    @Column(name = "Correo", nullable = false, length = 70)
    private String Correo;

    @Column(name = "Id_AFP", nullable = false, length = 2)
    private Integer Id_AFP;

    @Column(name = "Monto_Disponible", nullable = false)
    private Double Monto_Disponible;

    @Column(name = "Fecha_Retiro", nullable = false, length = 10)
    private String Fecha_Retiro;

    @Column(name = "Nro_Cta", nullable = false, length = 20)
    private String Nro_Cta;
}
