package db.evaluation.springboot.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import db.evaluation.springboot.entity.Product;
import db.evaluation.springboot.exceptions.ProductNotFoundException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

	private final WebClient webClient;
	
	
	public ProductService(WebClient webClient) {
		this.webClient = webClient;
	}

	
	public Product save(Product obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Product update(Product obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Flux<Product> getAll() {
		return webClient.get().uri("/products").retrieve().bodyToFlux(Product.class)
				.switchIfEmpty(Flux.error(new ProductNotFoundException("Products not found.")));
	}

	
	public Mono<Product> getById(Integer id) {
		return webClient.get().uri("/products/{id}", id).retrieve().bodyToMono(Product.class)
				.switchIfEmpty(Mono.error(new ProductNotFoundException("The product was not found.")));
	}

	
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
