package com.springboot.api.rest.model.dao;

import com.springboot.api.rest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


}
