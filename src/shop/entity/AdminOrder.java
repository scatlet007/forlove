package shop.entity;

/**
 * ������
 * @author letmetria
 *
 */
public class AdminOrder {
	private String orderid;			//��ʶ
	private String ordertime;		//�µ�ʱ��
	private float total;			//�ϼƽ��
	private String  address;		//������ַ
	private String adminid;			//����ԱID
	
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
