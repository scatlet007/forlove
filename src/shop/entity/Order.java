package shop.entity;

import java.util.Date;

/**
 * ����
 * @author letmetria
 *
 */
public class Order {
	private String orderid;		//��ʶ
	private Date ordertime;		//�µ�ʱ��
	private float total;		//����״̬
	private String status;		//������ϸ
	private String address;		//�ջ���ַ
	private String userid;		//�û�ID
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
