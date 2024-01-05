package com.comfama.reto.api.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Componente de Spring que permite la carga de propiedades personalizadas
 * definidas en el archivo de configuracion del proyecto
 * 
 * @author eduardarbelaez@comfama.com.co
 *
 */
@Component
@ConfigurationProperties(prefix = "archetype")
public class ArchetypeProperties {

}
