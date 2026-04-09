package com.joseronildo.UsuarioApi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioCreateDTO {

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @Size(min = 6)
    private String senha;

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}