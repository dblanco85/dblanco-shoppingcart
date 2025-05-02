package db.evaluation.springboot.entity.dto;

public class PaymentDto {
	
	private Integer id;
	private OrderDto order;
	private double totalAmount;
	private String paymentDate;
	private String message;
	
	public PaymentDto() {
		
	}

	public PaymentDto(Integer id, OrderDto order, double totalAmount, String paymentDate, String message) {
		this.id = id;
		this.order = order;
		this.totalAmount = totalAmount;
		this.paymentDate = paymentDate;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
