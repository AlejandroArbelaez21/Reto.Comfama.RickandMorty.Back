package com.comfama.api.archetype.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.comfama.api.archetype.repository.ProductRepository;
import com.google.gson.Gson;

/**
 * Clase a implementar la logica
 * 
 * @author felipe.olis
 *
 */
@Service
public class ArchetypeBusinessImpl implements ArchetypeBusiness {

	/** Logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ArchetypeBusinessImpl.class);

	/** Gson serializer */
	private final Gson gson;

	/** Objeto para realizar operaciones CRUD sobre la entidad Product */
	private ProductRepository productRepository;

	/**
	 * Metodo constructor
	 */
	public ArchetypeBusinessImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
		this.gson = new Gson();
	}

}
