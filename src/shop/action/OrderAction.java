package shop.action;

import com.opensymphony.xwork2.ActionSupport;

import shop.service.OrderService;

public class OrderAction extends ActionSupport{
	private OrderService orderService;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
}
