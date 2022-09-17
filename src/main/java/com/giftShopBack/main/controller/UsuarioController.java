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
import com.giftShopBack.main.services.UsuarioService;

@RestController()
@RequestMapping("/api/usuario/")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/getUsuarios")
	public List<Usuario> getUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	@PostMapping("/addUsuario")
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}

	@PostMapping("/validarUsuario")
	public Usuario validateUsuario(@RequestBody LoginForm data) {
		return usuarioService.validateUsuarioLogin(data);
	}

}
