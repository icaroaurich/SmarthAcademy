package com.ppr.genkai.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppr.genkai.entities.Usuario;
import com.ppr.genkai.services.UserServiceImpl;

@CrossOrigin
@RestController
@RequestMapping(value = "/usuario")
public class ProductController {
	
	@Autowired
	UserServiceImpl service;
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody Usuario usuario) {

		String retorno = service.registerUser(usuario);
		return retorno;
	}
	
	@PostMapping("/getId") // Recebe email e senha e retorna o ID
	public int getId(@RequestBody Usuario usuario) {

		int retorno = service.getId(usuario);
		return retorno;
	}
	
	@GetMapping("/getUser/{id}") // recebe ID e retorna o obj Usuario (com todos os dados)
	public Optional<Usuario> getUser(@PathVariable int id) {
		
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario = service.getUser(usuario);
		
		return Optional.of(usuario);

	}
	

}








































