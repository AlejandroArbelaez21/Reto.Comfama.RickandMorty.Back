package com.comfama.reto.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicacion. Permite ejecutar el proyecto.
 * 
 * @author alejandro.arbelaez
 *
 */
@SpringBootApplication
public class RetoMicroserviceApplication {

	/**
	 * Metodo encargado de ejecutar la aplicacion Spring boot
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(RetoMicroserviceApplication.class, args);
	}
}
