package com.springboot.api.rest.model.services;

import com.springboot.api.rest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente findById(Long id);
}
