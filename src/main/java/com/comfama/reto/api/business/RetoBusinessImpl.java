package com.comfama.reto.api.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.comfama.reto.api.repository.CharacterRepository;
import com.google.gson.Gson;

/**
 * Clase a implementar la logica
 * 
 * @author alejandro.arbelaez
 *
 */
@Service
public class ArchetypeBusinessImpl implements ArchetypeBusiness {

	/** Logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ArchetypeBusinessImpl.class);

	/** Gson serializer */
	private final Gson gson;

	/** Objeto para realizar operaciones CRUD sobre la entidad Product */
	private CharacterRepository productRepository;

	/**
	 * Metodo constructor
	 */
	public ArchetypeBusinessImpl(CharacterRepository productRepository) {
		this.productRepository = productRepository;
		this.gson = new Gson();
	}

}
