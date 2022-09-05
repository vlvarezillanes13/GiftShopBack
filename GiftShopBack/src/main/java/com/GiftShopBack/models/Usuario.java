package com.GiftShopBack.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic (optional = false)
	@Column(name = "USU_ID_USUARIO")
	private Integer USU_ID_USUARIO;
	
	@Column(name = "USU_NOMBRE")
	private String USU_NOMBRE;
	
	@Column(name = "USU_APELLIDO")
	private String USU_APELLIDO;
	
	@Column(name = "USU_USERNAME")
	private String USU_USERNAME;
	
	@Column(name = "USU_CLAVE")
	private String USU_CLAVE;
	
	@Column(name = "Rol_idRol")
	private Integer Rol_idRol;

	public Integer getUSU_ID_USUARIO() {
		return USU_ID_USUARIO;
	}

	public void setUSU_ID_USUARIO(Integer uSU_ID_USUARIO) {
		USU_ID_USUARIO = uSU_ID_USUARIO;
	}

	public String getUSU_NOMBRE() {
		return USU_NOMBRE;
	}

	public void setUSU_NOMBRE(String uSU_NOMBRE) {
		USU_NOMBRE = uSU_NOMBRE;
	}

	public String getUSU_APELLIDO() {
		return USU_APELLIDO;
	}

	public void setUSU_APELLIDO(String uSU_APELLIDO) {
		USU_APELLIDO = uSU_APELLIDO;
	}

	public String getUSU_USERNAME() {
		return USU_USERNAME;
	}

	public void setUSU_USERNAME(String uSU_USERNAME) {
		USU_USERNAME = uSU_USERNAME;
	}

	public String getUSU_CLAVE() {
		return USU_CLAVE;
	}

	public void setUSU_CLAVE(String uSU_CLAVE) {
		USU_CLAVE = uSU_CLAVE;
	}

	public Integer getRol_idRol() {
		return Rol_idRol;
	}

	public void setRol_idRol(Integer rol_idRol) {
		Rol_idRol = rol_idRol;
	}
	
	
	
	
	
	
	
	
	
	
	
}
 
	
	 
		

