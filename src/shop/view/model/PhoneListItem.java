package shop.view.model;

public class PhoneListItem 
{
	private String phoneid;		//��ʶ
	private String title;		//��ʾ����
	private float price;		//�۸�
	private String icon;		//Сͼ��ַ��ȡ�ֻ�ͼƬ�ĵ�һ��
	
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}	
}
