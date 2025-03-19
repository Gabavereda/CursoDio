package com.gaba.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gaba.aula_spring_data_jpa.model.User;
import com.gaba.aula_spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        User user = new User();

        user.setName("gaba");
        user.setUsername("gabaVereda");
        user.setPassword("dio123");

        repository.save(user);

        for (User u : repository.findAll()) {

            System.out.println("usuarios cadastrados " + u);

        }
    }

}
