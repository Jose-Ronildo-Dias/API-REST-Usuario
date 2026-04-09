package com.joseronildo.UsuarioApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.joseronildo.UsuarioApi.model.Usuario;
import com.joseronildo.UsuarioApi.repository.UsuarioRepository;

import java.time.LocalDateTime;

@SpringBootApplication
public class UsuarioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository repository) {
		return args -> {
			// Exemplo de usuário inicial
			Usuario u = new Usuario();
			u.setNome("José dias");
			u.setEmail("jose@email.com");
			u.setSenha("123456");
			u.setDataCriacao(LocalDateTime.now());
			repository.save(u);
		};
	}
}