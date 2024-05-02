package com.prueba.spring.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity Cuenta
 * @author ecasa on 2024/05/02.
 * @version 1.0.0
 */

@Entity
@Data
@Table(name = "cliente", schema = "public")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteid", nullable = false)
    private Integer clienteId;

    @Column(name = "clave", nullable = false, length = 50)
    private String clave;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

}
