package db.evaluation.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.evaluation.springboot.entity.Order;
import db.evaluation.springboot.entity.dto.OrderDto;
import db.evaluation.springboot.service.impl.OrderService;
import db.evaluation.springboot.util.DtoUtil;

@RestController
@RequestMapping("/order")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> getOrderById(@PathVariable Integer id) {
		try {
			Order order = orderService.getById(id);
			OrderDto orderDto = new OrderDto();
			orderDto = DtoUtil.orderToDto(order);
			return ResponseEntity.status(HttpStatus.OK).body(orderDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	
}
