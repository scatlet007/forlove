package shop.entity;

/**
 * Ʒ��
 * @author letmetria
 *
 */
public class Brand {
	private String brandid;			//��ʶ
	private String brandname;		//Ʒ����
	private String parentid;		//�ϼ�id
	
	public String getBrandid() {
		return brandid;
	}
	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	
}
