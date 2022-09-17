package com.giftShopBack.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.giftShopBack.main.excepciones.ResourceNotFoundException;
import com.giftShopBack.main.models.Categoria;
import com.giftShopBack.main.repositorio.CategoriaRepositorio;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositorio repositorio_categorias;
	
	public List<Categoria> getAllCategorias() {
		return (List<Categoria>) repositorio_categorias.findAll();
	}
	
	public Categoria getCategoriaById(Integer id) {
		Categoria cat = repositorio_categorias.findById(id)
				 	.orElseThrow(() -> new ResourceNotFoundException("No existe el categoria con el ID : " + id));
		return  cat;
	}
	
	public Categoria addCategoria(Categoria categoria) {
		return (Categoria) repositorio_categorias.save(categoria);
	}
}
