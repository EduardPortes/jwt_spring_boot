package com.portes.jwt_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portes.jwt_test.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
