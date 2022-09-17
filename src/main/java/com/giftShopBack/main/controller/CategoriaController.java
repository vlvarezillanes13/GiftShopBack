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
import com.giftShopBack.main.models.Categoria;
import com.giftShopBack.main.services.CategoriaService;

@RestController()
@RequestMapping("/api/categoria/")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/getCategorias")
	public List<Categoria> getCategorias() {
		return categoriaService.getAllCategorias();
	}

	@GetMapping("/getCategoria")
	public Categoria getCategoria(@RequestParam Integer id) {
		return categoriaService.getCategoriaById(id);
	}
	
	@PostMapping("/addCategoria")
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return categoriaService.addCategoria(categoria);
	}

}
