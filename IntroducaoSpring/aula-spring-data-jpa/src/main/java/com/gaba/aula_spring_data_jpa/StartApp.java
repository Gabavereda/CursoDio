package com.gaba.aula_spring_data_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gaba.aula_spring_data_jpa.model.TestesDio;
import com.gaba.aula_spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<TestesDio> users = repository.filtrarPorNome("araujo");

        for (TestesDio u : users) {
            System.out.println(u);

        }

    }

    private void insertUser() {

        TestesDio user = new TestesDio();

        user.setName("gaba");
        user.setUsername("gaba");
        user.setPassword("dio123");

        repository.save(user);

        for (TestesDio u : repository.findAll()) {

            System.out.println("usuarios cadastrados " + u);

        }
    }
}
