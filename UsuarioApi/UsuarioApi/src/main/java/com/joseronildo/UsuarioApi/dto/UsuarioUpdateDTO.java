package com.joseronildo.UsuarioApi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioUpdateDTO {

    @NotBlank
    private String nome;

    @Size(min = 6)
    private String senha;

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}