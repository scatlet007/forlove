package shop.entity;

/**
 * �ֻ���Ϣ
 * @author letmetria
 *
 */
public class Phone {
	private String phoneid;		//��ʶ
	private String phonename;	//��Ʒ��
	private String title;	//��ʾ����
	private float price;	//�۸�
	private String brandid;	//������Ʒ��
	
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
