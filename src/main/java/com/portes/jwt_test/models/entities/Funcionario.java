package com.portes.jwt_test.models.entities;

import com.portes.jwt_test.models.dto.FuncionarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Cargo cargo;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String email, String telefone, Cargo cargo) {

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    public Funcionario(Long id, String nome, Cargo cargo) {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    public FuncionarioDTO toDTO() {

        FuncionarioDTO fDTO = new FuncionarioDTO();

        fDTO.setId(this.id);
        fDTO.setNome(this.nome);
        fDTO.setCargo(this.cargo);

        return fDTO;
    }

    public Funcionario fromDTO(FuncionarioDTO fDTO) {

        Funcionario f = new Funcionario(fDTO.getId(), fDTO.getNome(), fDTO.getCargo());

        return f;
    }

    

    
}
