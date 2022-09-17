package com.giftShopBack.main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	@Column(name = "nombre", length = 100, nullable = false,unique=true)
	private String nombre;
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	@Column(name = "descripcion", length = 100, nullable = true)
	private String descripcion;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="categoria_id", nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Categoria categoria;
}
