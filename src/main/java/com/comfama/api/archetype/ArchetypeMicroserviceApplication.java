package com.comfama.api.archetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicacion. Permite ejecutar el proyecto.
 * 
 * @author felipe.olis
 *
 */
@SpringBootApplication
public class ArchetypeMicroserviceApplication {

	/**
	 * Metodo encargado de ejecutar la aplicacion Spring boot
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ArchetypeMicroserviceApplication.class, args);
	}
}
