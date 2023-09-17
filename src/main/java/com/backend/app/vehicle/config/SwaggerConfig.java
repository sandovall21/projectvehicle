package com.backend.app.vehicle.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.backend.app.vehicle.controllers"))
				.paths(PathSelectors.any())
   				.build()
   		        .apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Vehícle",
				"Servicio para vehículos",
				"1.0.0",
				"Términos de servicios",
				new Contact("Jesús Sandoval", "https://www.google.com", "sandovall_@outlook.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}