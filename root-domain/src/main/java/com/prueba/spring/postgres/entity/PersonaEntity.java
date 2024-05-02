package com.prueba.spring.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity Persona
 * @author ecasa on 2024/05/02.
 * @version 1.0.0
 */
@Entity
@Data
@Table(name = "persona", schema = "public")
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personaid", nullable = false)
    private Integer clienteId;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "genero", nullable = false, length = 50)
    private String genero;

    @Column(name = "edad", nullable = false, length = 50)
    private Integer edad;

    @Column(name = "identificacion", nullable = false, length = 50)
    private String identificacion;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;
}
