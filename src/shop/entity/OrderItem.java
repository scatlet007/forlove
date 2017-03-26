package shop.entity;

/**
 * 订单详细
 * @author letmetria
 *
 */
public class OrderItem {
	private String orderitemid;		//标识
	private int quantity;			//数量
	private float subtotal;			//小计
	private String phoneid;			//商品标识
	private String ptitle;			//显示标题
	private float price;			//单价
	private String image;			//手机小图地址
	private String orderid;			//所属订单ID
	
	public String getOrderitemid() {
		return orderitemid;
	}
	public void setOrderitemid(String orderitemid) {
		this.orderitemid = orderitemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
}
