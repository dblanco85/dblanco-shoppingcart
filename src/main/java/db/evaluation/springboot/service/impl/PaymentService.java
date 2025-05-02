package db.evaluation.springboot.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import db.evaluation.springboot.entity.Order;
import db.evaluation.springboot.entity.OrderDetail;
import db.evaluation.springboot.entity.Payment;
import db.evaluation.springboot.service.ICrud;

@Service
public class PaymentService implements ICrud<Payment>{

	@Override
	public Payment save(Payment obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment update(Payment obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Payment executePayment(Order order) {
		double totalAmount = 0;
		Payment payment = new Payment();
		payment.setOrder(order);
		
		for(OrderDetail oDet : order.getOrderDetails()) {
			totalAmount += oDet.getProduct().getPrice() * oDet.getQuantity();
		}
		
		payment.setTotalAmount(totalAmount);
		payment.setPaymentDate(new Date());
		payment.setMessage("Payment OK");
		
		return payment;
	}

}
