package shop.entity;

/**
 * 购物车
 * @author letmetria
 *
 */
public class CarItem {
	private String caritemid;		//标识
	private String userid;	//关联用户
	private String phoneid;	//商品标识
	private int quantity;	//数量
	private int orders;	//序号，用于排序
	public String getCaritemid() {
		return caritemid;
	}
	public void setCaritemid(String caritemid) {
		this.caritemid = caritemid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}
	
}
