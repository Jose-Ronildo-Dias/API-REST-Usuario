package com.joseronildo.UsuarioApi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.joseronildo.UsuarioApi.dto.*;
import com.joseronildo.UsuarioApi.service.UsuarioService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> criar(@Valid @RequestBody UsuarioCreateDTO dto) {
        return ResponseEntity.status(201).body(service.criarUsuario(dto));
    }

    @GetMapping
    public List<UsuarioResponseDTO> listar() {
        return service.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioResponseDTO buscar(@PathVariable Long id) {
        return service.buscarUsuario(id);
    }

    @PutMapping("/{id}")
    public UsuarioResponseDTO atualizar(@PathVariable Long id,
                                        @Valid @RequestBody UsuarioUpdateDTO dto) {
        return service.atualizarUsuario(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}