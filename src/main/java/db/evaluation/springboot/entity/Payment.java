package db.evaluation.springboot.entity;

import java.util.Date;

public class Payment {
	
	private Integer id;
	private Order order;
	private double totalAmount;
	private Date paymentDate;
	private String message;
	
	public Payment() {
		
	}
	
	public Payment(Integer id, Order order, double totalAmount, Date paymentDate, String message) {
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
