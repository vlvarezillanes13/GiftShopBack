package com.giftShopBack.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftShopBack.main.models.LoginForm;
import com.giftShopBack.main.models.Usuario;
import com.giftShopBack.main.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositorio repositorio_usuario;

	public List<Usuario> getAllUsuarios() {
		return (List<Usuario>) repositorio_usuario.findAll();
	}

	public Usuario addUsuario(Usuario usuario) {
		return (Usuario) repositorio_usuario.save(usuario);
	}

	public Usuario validateUsuarioLogin(LoginForm data) {
		for (Usuario usuario : repositorio_usuario.findAll()) {
			if (usuario.getUsername().equals(data.getUsername()) && usuario.getPassword().equals(data.getPassword())
					&& usuario.getEstado()) {
				return usuario;
			}
		}
		return null;
	}
}
