package com.gaba.web_api_dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaba.web_api_dio.model.Usuario;
import com.gaba.web_api_dio.repository.UsuarioRepository;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @GetMapping("listar")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("buscarNome/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

}
