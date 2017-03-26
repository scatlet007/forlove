package shop.entity;

import java.util.Date;

/**
 * 订单
 * @author letmetria
 *
 */
public class Order {
	private String orderid;		//标识
	private Date ordertime;		//下单时间
	private float total;		//订单状态
	private String status;		//订单详细
	private String address;		//收货地址
	private String userid;		//用户ID
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
