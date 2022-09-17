package com.giftShopBack.main.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.giftShopBack.main.models.Categoria;

@Repository
public interface CategoriaRepositorio extends CrudRepository<Categoria, Integer> {

}
