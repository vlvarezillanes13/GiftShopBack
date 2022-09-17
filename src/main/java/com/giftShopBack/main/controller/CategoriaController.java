package com.giftShopBack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giftShopBack.main.excepciones.ResourceNotFoundException;
import com.giftShopBack.main.models.Categoria;
import com.giftShopBack.main.repositorio.CategoriaRepositorio;

@RestController()
@RequestMapping("/api/categoria/")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepositorio repositorio;

	@GetMapping("/getCategorias")
	public List<Categoria> getCategorias() {
		return (List<Categoria>) repositorio.findAll();
	}

	@GetMapping("/getCategoria")
	public Categoria getCategoria(@RequestParam Integer id) {
		Categoria cat = repositorio.findById(id)
				 	.orElseThrow(() -> new ResourceNotFoundException("No existe el categoria con el ID : " + id));
		return  cat ;
	}

	@PostMapping("/addCategoria")
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return (Categoria) repositorio.save(categoria);
	}

}
