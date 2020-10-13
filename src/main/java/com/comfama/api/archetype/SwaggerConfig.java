package com.comfama.api.archetype;

import java.util.Collections;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase encargada de la documentacion de la aplicacion
 * 
 * @author felipe.olis
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.comfama.api.archetype.rest")).paths(PathSelectors.any())
				.build().useDefaultResponseMessages(false).apiInfo(apiInfo());
	}

	/**
	 * Metodo que permite definir la informacion general que aplica a todas las Apis
	 * expuestas en este proyecto
	 * 
	 * @return Objeto con la informacion de las Apis
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo("Core Rest service", "Microservicio enfocado a los servicios transversales de Comfama",
				"1.0", "Visita https://example.com/terms",
				new Contact("Felipe Olis", "www.pragma.com.co", "felipe.olis@pragma.com.co"), "License",
				"www.pragma.com.co/license", Collections.emptyList());
	}

}
