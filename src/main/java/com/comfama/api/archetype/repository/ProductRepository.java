package com.comfama.api.archetype.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comfama.api.archetype.model.Product;

/**
 * Repository de Spring para las operaciones CRUD sobre la tabla PRODUCT.
 * 
 * @author felipe.olis
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	/**
	 * Permite consultar un producto mediante su codigo
	 * 
	 * @param code Codigo del producto a consultar
	 * @return Objecto con la información del producto en caso de que exista un
	 *         resultado
	 */
	Optional<Product> findByCode(String code);
}
