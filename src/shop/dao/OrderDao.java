package shop.dao;

import java.util.List;

import shop.entity.Order;

public interface OrderDao {
	
	public void save(Order order);
	
	public void update(Order order);
	
	public void delete(String orderid);
	
	public List<Order> get(String userid);
}
