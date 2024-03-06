package com.curso.springboot.backend.backendproducts.repositories;


import com.curso.springboot.backend.backendproducts.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
ProductRepository para un servicio que interactua con el cliente en forma dinamica
a traves de servicos Rest.
Los servicios res de hipermedia HATEOAS
son las siglas de Hypermedia(texto Json) As the Engine Of Applications state
como motor del estado de la aplicacion

la APIRES servicio da la informacion al cliente de forma dinamica
un cliente inteactua con aplicacion backend esta le pasa toda la
informacion de forma dinamicaatraves de esta hipermedia

sin pasar por el controlador ni implementacion services
solo por el repository se anota y se mapea a una ruta
@RepositoryRestResource(path=" ")

*/

@CrossOrigin(origins = "http://localhost:5173")
@RepositoryRestResource(path ="products")
public interface ProductRepository extends CrudRepository<Product, Long> {

}
