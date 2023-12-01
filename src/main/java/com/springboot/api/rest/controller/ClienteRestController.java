package com.springboot.api.rest.controller;

import com.springboot.api.rest.model.entity.Cliente;
import com.springboot.api.rest.model.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente showId(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PostMapping("clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }


}
