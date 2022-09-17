package com.giftShopBack.main.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.giftShopBack.main.models.Producto;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto, Integer> {

}
