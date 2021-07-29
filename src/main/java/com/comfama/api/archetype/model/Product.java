package com.comfama.api.archetype.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Clase que define una entidad para el mapeo O/R de la tabla PRODUCT.
 * 
 * @author felipe.olis
 *
 */
@Entity
public class Product {

	/** Id del producto */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/** Nombre del producto */
	private String name;
	/** Codigo del producto */
	@Column(unique = true, nullable = false, length = 10)
	@Size(min = 5, max = 10)
	private String code;
	/** Precio del producto */
	private Double price;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
}