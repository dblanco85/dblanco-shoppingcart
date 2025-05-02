package db.evaluation.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Flux<Product>> getAllProducts() {
		try {
			Flux<Product> productList = productService.getAll();
			return ResponseEntity.status(HttpStatus.OK).body(productList);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Mono<Product>> getProductById(@PathVariable Integer id) {
		try {
			Mono<Product> product = productService.getById(id);
			return ResponseEntity.status(HttpStatus.OK).body(product);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
