package shop.dao;

import java.util.List;

import shop.entity.OrderItem;

public interface OrderItemDao {
	
	public void save(OrderItem item);
	
	public void remove(String itemid);
	
	public List<OrderItem> get(String orderid);
}
