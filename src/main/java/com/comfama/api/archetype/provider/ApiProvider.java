package com.comfama.api.archetype.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.comfama.api.archetype.util.ArchetypeProperties;

/**
 * Componente que permite realizar el consumo de los servicios expuestos por el
 * microservicio de gigya
 * 
 * @author felipe.olis
 *
 */
@Component
public class ApiProvider {
	/** Objeto para la carga de propiedades de configuracion */
	private final ArchetypeProperties properties;
	/** Logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ApiProvider.class);

	/**
	 * Metodo constructor
	 * 
	 * @param restTemplate
	 */
	public ApiProvider(ArchetypeProperties properties) {
		this.properties = properties;
	}

}
