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
import com.giftShopBack.main.models.Producto;
import com.giftShopBack.main.services.ProductoService;

@RestController()
@RequestMapping("/api/producto/")
@CrossOrigin("*")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/getProductos")
	public List<Producto> getProductos() {
		return productoService.getAllProductos();
	}

	@GetMapping("/getProductosByCategoria")
	public List<Producto> getProductosByCategoria(@RequestParam Integer id ) {
		return productoService.getProductosByCategoria(id);
	}

	@PostMapping("/addProducto")
	public Producto addProducto(@RequestBody Producto prod, @RequestParam Integer id) {
		return productoService.addProducto(prod, id);
	}
}
