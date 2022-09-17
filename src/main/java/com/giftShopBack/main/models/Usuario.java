package com.giftShopBack.main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;
	@Column(name = "apellido", length = 100, nullable = false)
	private String apellido;
	@Column(name = "usermame", length = 100, nullable = false, unique=true)
	private String username;
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	@Column(name = "estado", nullable = false)
	private Boolean estado;
	@Column(name = "rol", nullable = false)
	private Rol rol;
}
