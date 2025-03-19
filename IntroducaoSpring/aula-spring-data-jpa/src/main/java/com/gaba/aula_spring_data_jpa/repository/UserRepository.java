package com.gaba.aula_spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gaba.aula_spring_data_jpa.model.TestesDio;

public interface UserRepository extends JpaRepository<TestesDio, Integer> {

    // Query
    List<TestesDio> findByNameContaining(String name);

    // Query
    TestesDio findByUsername(String username);

    // Query Override
    @Query("SELECT   u  FROM TestesDio u WHERE u.name LIKE %:name%")
    List<TestesDio> filtrarPorNome(@Param("name") String name);

}
