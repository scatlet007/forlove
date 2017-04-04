package shop.service;

import java.util.List;

import shop.dao.OrderDao;
import shop.dao.OrderItemDao;
import shop.entity.Order;
import shop.entity.OrderItem;

public class OrderService 
{
	private OrderDao orderDao;
	private OrderItemDao orderItemDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void setOrderItemDao(OrderItemDao orderItemDao) {
		this.orderItemDao = orderItemDao;
	}
	
	public void saveOrder(Order order)
	{
		orderDao.save(order);
	}
	
	public void updateOrder(Order order)
	{
		orderDao.update(order);
	}
	
	public void deleteOrder(String orderid)
	{
		orderDao.delete(orderid);
	}
	
	public void deleteOrder(String[] orderids)
	{
		for(String orderid:orderids)
			orderDao.delete(orderid);
	}
	
	public List<Order> getOrder(String userid)
	{
		return orderDao.get(userid);
	}
	
	public void saveOrderItem(OrderItem item)
	{
		orderItemDao.save(item);
	}
	
	public void removeOrderItem(String itemid)
	{
		orderItemDao.remove(itemid);
	}
	
	public void removeOrderItem(String[] itemids)
	{	
		for(String itemid:itemids)
			orderItemDao.remove(itemid);
	}
	
	public List<OrderItem> getOrderItem(String orderid)
	{
		return orderItemDao.get(orderid);
	}
}
