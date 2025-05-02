package db.evaluation.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.evaluation.springboot.entity.Product;
import db.evaluation.springboot.service.impl.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public Flux<Product> getAllProducts() {
		return productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Product> getProductById(@PathVariable Integer id) {
		return productService.getById(id);
	}
}
