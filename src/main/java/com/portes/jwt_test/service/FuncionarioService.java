package com.portes.jwt_test.service;

import java.util.List;

import com.portes.jwt_test.models.dto.FuncionarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portes.jwt_test.models.entities.Funcionario;
import com.portes.jwt_test.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioDTO> findAll() {
        List<Funcionario> list = repository.findAll();
        return list.stream().map(Funcionario::toDTO).toList();
    }

    public FuncionarioDTO findById(Long id) {
        Funcionario f = repository.findById(id).get();
        return f.toDTO();
    }

}
