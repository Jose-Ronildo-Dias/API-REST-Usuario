package com.joseronildo.UsuarioApi.mapper;

import org.mapstruct.Mapper;
import com.joseronildo.UsuarioApi.model.Usuario;
import com.joseronildo.UsuarioApi.dto.UsuarioCreateDTO;
import com.joseronildo.UsuarioApi.dto.UsuarioUpdateDTO;
import com.joseronildo.UsuarioApi.dto.UsuarioResponseDTO;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioCreateDTO dto);

    void updateEntityFromDto(UsuarioUpdateDTO dto, @MappingTarget Usuario usuario);

    UsuarioResponseDTO toResponseDTO(Usuario usuario);
}