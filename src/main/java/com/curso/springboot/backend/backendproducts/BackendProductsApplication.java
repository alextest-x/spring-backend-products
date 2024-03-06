package com.curso.springboot.backend.backendproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    aplicacion REst que solo se implementa la clase entity y el repository
    no ocupa controlador no implementacion de service todo lo hacce el framework por debajo
    de forma estandar o varias tablas un crontrolador crud automatico generico
    el get, udpate, create, y deleted
    se automatiza la aplicacion

    dependecias utilizadas
    spring-boot-starter-data-rest
    spring-boot-starter-data-web
    spring-boot-starter-data-jpa
    spring-boot-devtools

 */


@SpringBootApplication
public class BackendProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendProductsApplication.class, args);
	}

}
