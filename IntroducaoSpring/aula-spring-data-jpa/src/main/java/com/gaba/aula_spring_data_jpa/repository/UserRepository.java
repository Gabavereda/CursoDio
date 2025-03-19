package com.gaba.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaba.aula_spring_data_jpa.model.TestesDio;

public interface UserRepository extends JpaRepository<TestesDio, Integer> {

}
