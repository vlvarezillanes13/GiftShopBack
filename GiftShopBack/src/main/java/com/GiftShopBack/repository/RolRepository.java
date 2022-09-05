package com.GiftShopBack.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GiftShopBack.models.Rol;

@Repository("rolRepository")

public interface RolRepository extends JpaRepository<Rol, Serializable>{
	
}

 
	 
