package com.prueba.spring.postgres.repository;


import com.prueba.spring.postgres.entity.CuentaEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICuentaRepository extends CrudRepository<CuentaEntity, Integer> {
}
