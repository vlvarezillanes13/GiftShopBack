package com.giftShopBack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giftShopBack.main.models.LoginForm;
import com.giftShopBack.main.models.Usuario;
import com.giftShopBack.main.repositorio.UsuarioRepositorio;


@RestController()
@RequestMapping("/api/usuario/")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/getUsuarios")
	public List<Usuario> getUsuarios() {
		return (List<Usuario>) repositorio.findAll();
	}
	
	@PostMapping("/addUsuario")
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		if( this.validarUsuario(usuario)) {
			return (Usuario) repositorio.save(usuario);
		}
		return null;
	}
	
	@PostMapping("/validarUsuario")
	public Usuario validateUsuario(@RequestBody LoginForm data) {
		for (Usuario usuario : repositorio.findAll()) {
			if( usuario.getUsername().equals(data.getUsername()) && usuario.getPassword().equals(data.getPassword()) && usuario.getEstado()) {
				return usuario;
			}
		}
		return null;
	}
	
	//Función para validar usuario
	private boolean validarUsuario(Usuario u) {
		if( u.getUsername().length() < 5 ||  u.getUsername().length() > 20) { return false; }
		else if( u.getPassword().length() < 5 ||  u.getPassword().length() > 20) { return false; }
		return true;
	}
	
}
