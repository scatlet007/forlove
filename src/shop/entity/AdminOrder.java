package shop.entity;

/**
 * 订购表
 * @author letmetria
 *
 */
public class AdminOrder {
	private String orderid;			//标识
	private String ordertime;		//下单时间
	private float total;			//合计金额
	private String  address;		//订购地址
	private String adminid;			//管理员ID
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
}
