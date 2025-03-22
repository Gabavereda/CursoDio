package com.gaba.web_api_dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaba.web_api_dio.model.Usuario;
import com.gaba.web_api_dio.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @GetMapping
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

}
