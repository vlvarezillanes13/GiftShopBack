package com.giftShopBack.main.controller;

import java.util.ArrayList;
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
import com.giftShopBack.main.models.Producto;
import com.giftShopBack.main.repositorio.CategoriaRepositorio;
import com.giftShopBack.main.repositorio.ProductoRepositorio;
import com.giftShopBack.main.services.ProductoService;

@RestController()
@RequestMapping("/api/producto/")
@CrossOrigin("*")
public class ProductoController {

	@Autowired
	private ProductoRepositorio repositorio;
	
	@Autowired
    private ProductoService productoService;
	
	@GetMapping("/getProductos")
	public List<Producto> getProductos() {
		return (List<Producto>) repositorio.findAll();
	}
	
	@GetMapping("/getProductosByCategoria")
	public List<Producto> getProductosByCategoria(@RequestBody Categoria cat) {
		List<Producto> productos = new ArrayList<>();
		for (Producto producto : repositorio.findAll()) {
			if( producto.getCategoria() == cat) {
				productos.add(producto);
			}
		}
		return productos;
	}

	@PostMapping("/addProducto")
	public Producto addProducto(@RequestBody Producto prod, @RequestParam Integer id) {
		return (Producto) productoService.addProducto(prod, id);
	}
}
