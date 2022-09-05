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

import com.GiftShopBack.models.Rol;
import com.GiftShopBack.repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolController {
	
	@Autowired
	RolRepository rolRepository;
	
	@GetMapping(path = "/buscar")
	public List<Rol> getAllRol(){
		return rolRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Rol saveRol(@RequestBody Rol rol) {
		return rolRepository.save(rol);
	}
	
	@DeleteMapping (path ="/eliminar/{idrol}")
	public void deleteRol(@PathVariable("idrol")Integer idrol) {
		
		Optional<Rol>rol;
		rol = rolRepository.findById(idrol);
		if (rol.isPresent()) {
		rolRepository.delete(rol.get());
		}
	}
	
		
}
	