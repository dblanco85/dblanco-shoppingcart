package db.evaluation.springboot.util;

import java.util.ArrayList;
import java.util.List;

import db.evaluation.springboot.entity.Customer;
import db.evaluation.springboot.entity.Order;
import db.evaluation.springboot.entity.OrderDetail;
import db.evaluation.springboot.entity.Payment;
import db.evaluation.springboot.entity.Product;
import db.evaluation.springboot.entity.dto.OrderDetailDto;
import db.evaluation.springboot.entity.dto.OrderDto;
import db.evaluation.springboot.entity.dto.PaymentDto;

public class DtoUtil {

	public static OrderDto orderToDto(Order order) throws Exception {
		OrderDto oDto = new OrderDto();
		oDto.setId(order.getId());
		oDto.setUserId(order.getCustomer().getId());
		oDto.setCreatedDate(order.getCreatedDate()==null? "" : DateUtil.convertDateToString(order.getCreatedDate()));
		oDto.setUpdatedDate(order.getUpdatedDate()==null? "" : DateUtil.convertDateToString(order.getUpdatedDate()));
		
		List<OrderDetailDto> orderDetailList = new ArrayList<>();
		
		for(OrderDetail oDet : order.getOrderDetails()) {
			orderDetailList.add(new OrderDetailDto(oDet.getId(), oDet.getProduct().getId(), oDet.getProduct().getPrice(), oDet.getQuantity()));
		}
		
		oDto.setOrderDetails(orderDetailList);
		
		return oDto;
	}
	
	public static Order dtoToOrder(OrderDto orderDto) throws Exception {
		Order order = new Order();
		order.setId(orderDto.getId());
		order.setCustomer(new Customer(orderDto.getUserId()));
		order.setCreatedDate(DateUtil.convertToDate(orderDto.getCreatedDate()));
		order.setUpdatedDate(DateUtil.convertToDate(orderDto.getUpdatedDate()));
		
		List<OrderDetail> orderDetailList = new ArrayList<>();
		
		for(OrderDetailDto oDet : orderDto.getOrderDetails()) {
			orderDetailList.add(new OrderDetail(oDet.getId(), new Product(oDet.getProductId(), oDet.getPrice()), oDet.getQuantity()));
		}
		
		order.setOrderDetails(orderDetailList);
		
		return order;
	}
	
	public static PaymentDto paymentToDto(Payment payment) throws Exception {
		PaymentDto payDto = new PaymentDto();
		payDto.setId(payment.getId());
		payDto.setOrder(orderToDto(payment.getOrder()));
		payDto.setTotalAmount(payment.getTotalAmount());
		payDto.setPaymentDate(payment.getPaymentDate()==null? "" : DateUtil.convertDateToString(payment.getPaymentDate()));
		payDto.setMessage(payment.getMessage());
		
		return payDto;
	}
}
