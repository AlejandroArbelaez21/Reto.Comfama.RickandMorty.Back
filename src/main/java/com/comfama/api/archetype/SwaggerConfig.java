package com.comfama.api.archetype;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
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
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.comfama.api.archetype.rest")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}

	/**
	 * Metodo que permite definir la informacion general que aplica a todas las Apis
	 * expuestas en este proyecto
	 * 
	 * @return Objeto con la informacion de las Apis
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo("Core Rest service",
				"Microservicio que define la arquitetura de los microservicios de la transversal de comfana", "1.0",
				"https://www.pragma.com.co/es/terminos-condiciones",
				new Contact("Felipe Olis", "https://www.pragma.com.co/es/nosotros", "felipe.olis@pragma.com.co"),
				"License", "https://www.pragma.com.co/es/terminos-condiciones", Collections.emptyList());
	}

}
