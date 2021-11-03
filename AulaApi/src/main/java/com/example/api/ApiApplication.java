package com.example.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.models.Produto;
import com.example.api.models.Usuario;
import com.example.api.repositorys.ProdutoRepository;
import com.example.api.repositorys.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario( "Maria Silva", "1234");
		Usuario u2 = new Usuario( "Joao da Silva", "1234");
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		
		Produto prod1 = new Produto( "Camisa", 20.00);
		Produto prod2 = new Produto( "Bermuda", 40.00);
		
		produtoRepository.saveAll(Arrays.asList(prod1, prod2));
	}

}
