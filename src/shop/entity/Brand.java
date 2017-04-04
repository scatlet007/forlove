package shop.entity;

/**
 * 品牌
 * @author letmetria
 *
 */
public class Brand {
	private String brandid;			//标识
	private String brandname;		//品牌名
	private String parentid;		//上级id
	
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
