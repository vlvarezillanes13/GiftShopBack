package com.giftShopBack.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftShopBack.main.excepciones.ResourceNotFoundException;
import com.giftShopBack.main.models.Producto;
import com.giftShopBack.main.repositorio.CategoriaRepositorio;
import com.giftShopBack.main.repositorio.ProductoRepositorio;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepositorio repositorio_productos;
	
	@Autowired
	private CategoriaRepositorio repositorio_categorias;
	
	public Producto addProducto(Producto producto, Integer id) {
        return repositorio_categorias.findById(id).map( cat -> {
        	producto.setCategoria(cat);
        	return repositorio_productos.save(producto);
        }).orElseThrow( () -> new ResourceNotFoundException("No se encontro categoria con ID "+id)); 
    }
	
	
}
