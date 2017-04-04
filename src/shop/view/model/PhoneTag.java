package shop.view.model;

/**
 * 向客户展示简易的手机信息
 * @author Administrator
 *
 */
public class PhoneTag {
	private String phoneid;	//手机ID
	private String title;	//手机展示标题
	private float price;	//手机价格
	private String imgurl;	//手机展示图片
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
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
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
}
