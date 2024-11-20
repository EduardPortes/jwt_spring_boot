package com.portes.jwt_test.models.dto;

import com.portes.jwt_test.models.entities.Cargo;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private Cargo cargo;

    public FuncionarioDTO(){
        
    }

    public FuncionarioDTO(Long id, String nome, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    
    
}
