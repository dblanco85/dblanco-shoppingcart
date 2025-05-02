package db.evaluation.springboot.entity.dto;

public class OrderDetailDto {

	private Integer id;
	private Integer productId;
	private double price;
	private Integer quantity;
	
	public OrderDetailDto() {
		
	}
	
	public OrderDetailDto(Integer id, Integer productId, double price, Integer quantity) {
		this.id = id;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
