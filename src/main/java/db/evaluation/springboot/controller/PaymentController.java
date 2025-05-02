package db.evaluation.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.evaluation.springboot.entity.Order;
import db.evaluation.springboot.entity.Payment;
import db.evaluation.springboot.entity.dto.OrderDto;
import db.evaluation.springboot.entity.dto.PaymentDto;
import db.evaluation.springboot.service.impl.PaymentService;
import db.evaluation.springboot.util.DtoUtil;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostMapping
	public ResponseEntity<PaymentDto> executePayment(@RequestBody OrderDto orderDto) {
		PaymentDto resp = new PaymentDto();
		try {
			Order order = DtoUtil.dtoToOrder(orderDto);
			Payment payment = paymentService.executePayment(order);
			resp = DtoUtil.paymentToDto(payment);
			return ResponseEntity.status(HttpStatus.OK).body(resp);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
