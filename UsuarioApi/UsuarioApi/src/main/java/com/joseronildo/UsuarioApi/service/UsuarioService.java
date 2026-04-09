package com.joseronildo.UsuarioApi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.joseronildo.UsuarioApi.model.Usuario;
import com.joseronildo.UsuarioApi.repository.UsuarioRepository;
import com.joseronildo.UsuarioApi.dto.*;
import com.joseronildo.UsuarioApi.mapper.UsuarioMapper;
import com.joseronildo.UsuarioApi.exception.ResourceNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository repository, UsuarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public UsuarioResponseDTO criarUsuario(UsuarioCreateDTO dto) {
        Usuario usuario = mapper.toEntity(dto);
        usuario.setDataCriacao(LocalDateTime.now());
        repository.save(usuario);
        return mapper.toResponseDTO(usuario);
    }

    @Transactional(readOnly = true)
    public List<UsuarioResponseDTO> listarUsuarios() {
        return repository.findAll().stream()
                .map(mapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UsuarioResponseDTO buscarUsuario(Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        return mapper.toResponseDTO(usuario);
    }

    @Transactional
    public UsuarioResponseDTO atualizarUsuario(Long id, UsuarioUpdateDTO dto) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        mapper.updateEntityFromDto(dto, usuario);
        return mapper.toResponseDTO(usuario);
    }

    @Transactional
    public void deletarUsuario(Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        repository.delete(usuario);
    }
}