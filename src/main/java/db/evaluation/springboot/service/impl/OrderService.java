package db.evaluation.springboot.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import db.evaluation.springboot.entity.Customer;
import db.evaluation.springboot.entity.Order;
import db.evaluation.springboot.entity.OrderDetail;
import db.evaluation.springboot.entity.Product;
import db.evaluation.springboot.entity.Rating;
import db.evaluation.springboot.service.ICrud;

@Service
public class OrderService implements ICrud<Order>{

	@Override
	public Order save(Order obj) {
		try {
			obj.setCreatedDate(new Date());
			return obj;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Order update(Order obj) {
		try {
			obj.setUpdatedDate(new Date());
			return obj;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getById(Integer id) {
		try {
			//simulate information from database
			Customer customer = new Customer(1, "dblanco", "dblanco@gmail.com", "");
			Product product1 = new Product();
			Product product2 = new Product();
			Product product3 = new Product();
			List<OrderDetail> orderDetailList = new ArrayList<>();
			
			product1.setId(3);
			product1.setTitle("Mens Cotton Jacket");
			product1.setPrice(55.99);
			product1.setDescription("great outerwear jackets for Spring/Autumn/Winter.");
			product1.setCategory("men's clothing");
			product1.setImage("https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg");
			product1.setRating(new Rating(4.7,500));
			
			product2.setId(11);
			product2.setTitle("Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5");
			product2.setPrice(109.0);
			product2.setDescription("3D NAND flash are applied to deliver high transfer speeds Remarkable transfer speeds that enable faster bootup and improved overall system performance.");
			product2.setCategory("electronics");
			product2.setImage("https://fakestoreapi.com/img/71kWymZ+c+L._AC_SX679_.jpg");
			product2.setRating(new Rating(4.8,319));
			
			product3.setId(14);
			product3.setTitle("Samsung 49-Inch CHG90 144Hz Curved Gaming Monitor (LC49HG90DMNXZA) – Super Ultrawide Screen QLED ");
			product3.setPrice(999.99);
			product3.setDescription("49 INCH SUPER ULTRAWIDE 32:9 CURVED GAMING MONITOR with dual 27 inch screen side by side QUANTUM DOT (QLED) TECHNOLOGY");
			product3.setCategory("electronics");
			product3.setImage("https://fakestoreapi.com/img/81Zt42ioCgL._AC_SX679_.jpg");
			product3.setRating(new Rating(2.2,140));
			
			orderDetailList.add(new OrderDetail(1, product1, 3));
			orderDetailList.add(new OrderDetail(2, product2, 2));
			orderDetailList.add(new OrderDetail(3, product3, 1));
			
			Order order = new Order();
			order.setId(id);
			order.setCustomer(customer);
			order.setCreatedDate(new Date());
			order.setUpdatedDate(new Date());
			order.setOrderDetails(orderDetailList);
			
			return order;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
