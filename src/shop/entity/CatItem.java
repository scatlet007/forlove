package shop.entity;

/**
 * ���ﳵ
 * @author letmetria
 *
 */
public class CatItem {
	private String carid;		//��ʶ
	private String userid;	//�����û�
	private String phoneid;	//��Ʒ��ʶ
	private int quantity;	//����
	private int orderBy;	//��ţ���������
	
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
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
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}
	
}
