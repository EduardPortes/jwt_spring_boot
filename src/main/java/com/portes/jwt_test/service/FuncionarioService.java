package com.portes.jwt_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portes.jwt_test.entities.Funcionario;
import com.portes.jwt_test.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll() {
        return repository.findAll();
    }

}
