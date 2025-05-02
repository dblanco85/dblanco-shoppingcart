package db.evaluation.springboot.entity.dto;

import java.util.List;

public class OrderDto {

	private Integer id;
	private Integer userId;
	private String createdDate;
	private String updatedDate;
	private List<OrderDetailDto> orderDetails;

	public OrderDto() {

	}

	public OrderDto(Integer id, Integer userId, String createdDate, String updatedDate,
			List<OrderDetailDto> orderDetails) {
		this.id = id;
		this.userId = userId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.orderDetails = orderDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<OrderDetailDto> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailDto> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
