package shop.view.model;

/**
 * ��ͻ�չʾ���׵��ֻ���Ϣ
 * @author Administrator
 *
 */
public class PhoneTag {
	private String phoneid;	//�ֻ�ID
	private String title;	//�ֻ�չʾ����
	private float price;	//�ֻ��۸�
	private String imgurl;	//�ֻ�չʾͼƬ
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
