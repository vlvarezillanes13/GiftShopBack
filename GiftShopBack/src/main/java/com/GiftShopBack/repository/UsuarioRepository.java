package com.GiftShopBack.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GiftShopBack.models.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario,Serializable>{
	
	public List<Usuario> findByUSU_USERNAMEAndUSU_CLAVE(String USU_NAME,String USU_CLAVE);
	
}
