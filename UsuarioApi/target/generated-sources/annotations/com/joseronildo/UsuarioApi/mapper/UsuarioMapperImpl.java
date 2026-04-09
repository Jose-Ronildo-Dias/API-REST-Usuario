package com.joseronildo.UsuarioApi.mapper;

import com.joseronildo.UsuarioApi.dto.UsuarioCreateDTO;
import com.joseronildo.UsuarioApi.dto.UsuarioResponseDTO;
import com.joseronildo.UsuarioApi.dto.UsuarioUpdateDTO;
import com.joseronildo.UsuarioApi.model.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-08T21:36:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 26 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toEntity(UsuarioCreateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNome( dto.getNome() );
        usuario.setEmail( dto.getEmail() );
        usuario.setSenha( dto.getSenha() );

        return usuario;
    }

    @Override
    public void updateEntityFromDto(UsuarioUpdateDTO dto, Usuario usuario) {
        if ( dto == null ) {
            return;
        }

        usuario.setNome( dto.getNome() );
        usuario.setSenha( dto.getSenha() );
    }

    @Override
    public UsuarioResponseDTO toResponseDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();

        usuarioResponseDTO.setId( usuario.getId() );
        usuarioResponseDTO.setNome( usuario.getNome() );
        usuarioResponseDTO.setEmail( usuario.getEmail() );
        usuarioResponseDTO.setDataCriacao( usuario.getDataCriacao() );

        return usuarioResponseDTO;
    }
}
