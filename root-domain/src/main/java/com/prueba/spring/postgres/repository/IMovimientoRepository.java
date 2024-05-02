package com.prueba.spring.postgres.repository;

import com.prueba.spring.postgres.entity.MovimientoEntity;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientoRepository extends CrudRepository<MovimientoEntity, Integer> {
}
