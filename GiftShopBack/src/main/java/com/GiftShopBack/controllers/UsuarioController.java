package com.GiftShopBack.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.GiftShopBack.models.Usuario;
import com.GiftShopBack.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path = "/buscar")
	public List<Usuario> getAllUsuario(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping (path ="/eliminar/{USU_ID_USUARIO}")
	public void deleteUsuario(@PathVariable("USU_ID_USUARIO")Integer USU_ID_USUARIO) {
		
		Optional<Usuario>usuario;
		usuario = usuarioRepository.findById(USU_ID_USUARIO);
		if (usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		}
	}
	
	@GetMapping(path = "/login/{USU_USERNAME}/{USU_CLAVE}")
	public String login(@PathVariable ("USU_USERNAME") String username,@PathVariable("USU_CLAVE") String clave) {
		String login ="ERROR";
		
		List<Usuario> usuario = usuarioRepository.findByUSU_USERNAMEAndUSU_CLAVE(username,clave);
				if (!usuario.isEmpty()) {
					login= "OK";
				}
		
		return login;
		
	}
		
	
}

