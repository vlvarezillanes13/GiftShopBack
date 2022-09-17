package com.giftShopBack.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftShopBack.main.excepciones.ResourceNotFoundException;
import com.giftShopBack.main.models.Categoria;
import com.giftShopBack.main.models.Producto;
import com.giftShopBack.main.repositorio.CategoriaRepositorio;
import com.giftShopBack.main.repositorio.ProductoRepositorio;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepositorio repositorio_productos;
	
	@Autowired
	private CategoriaRepositorio repositorio_categorias;
	
	public List<Producto> getAllProductos() {
		return (List<Producto>) repositorio_productos.findAll();
	}
	
	public List<Producto> getProductosByCategoria(Categoria cat) {
		List<Producto> productos = new ArrayList<>();
		for (Producto producto : repositorio_productos.findAll()) {
			if( producto.getCategoria() == cat) {
				productos.add(producto);
			}
		}
		return productos;
	}
	
	public Producto addProducto(Producto producto, Integer id) {
        return repositorio_categorias.findById(id).map( cat -> {
        	producto.setCategoria(cat);
        	return (Producto) repositorio_productos.save(producto);
        }).orElseThrow( () -> new ResourceNotFoundException("No se encontro categoria con ID "+id)); 
    }
	
	
}
