package shop.entity;

/**
 * ���ﳵ
 * @author letmetria
 *
 */
public class CarItem {
	private String caritemid;		//��ʶ
	private String userid;	//�����û�
	private String phoneid;	//��Ʒ��ʶ
	private int quantity;	//����
	private int orders;	//��ţ���������
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
