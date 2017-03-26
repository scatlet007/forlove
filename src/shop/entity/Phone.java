package shop.entity;

/**
 * 手机信息
 * @author letmetria
 *
 */
public class Phone {
	private String phoneid;		//标识
	private String phonename;	//商品名
	private String title;	//显示标题
	private float price;	//价格
	private String brandid;	//关联的品牌
	
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonename() {
		return phonename;
	}
	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrandid() {
		return brandid;
	}
	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}
	
}
