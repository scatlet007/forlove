package shop.entity;

public class AdminOrderItem {
	private String orderitemid;	//标识
	private int quantity;		//数量
	private float subtotal;		//小计
	private String phoneid;		//手机ID
	private String ptitle;		//手机标题
	private float price;		//单价
	private String image;		//小图地址
	private String adminorderid;		//所属订单
	private String describtion;	//描述
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
	public String getAdminorderid() {
		return adminorderid;
	}
	public void setAdminorderid(String adminorderid) {
		this.adminorderid = adminorderid;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	
}
