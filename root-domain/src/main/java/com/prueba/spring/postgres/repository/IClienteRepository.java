package com.prueba.spring.postgres.repository;

import com.prueba.spring.postgres.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<ClienteEntity, Integer> {
}
