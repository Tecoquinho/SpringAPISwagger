package com.ecommerce.ecom;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Ecommerce Teco", version = "v1", description = "Teste de Criação de API Restful com Java Spring"))
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class }) //Invalidando o Spring Security:
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

}
