package shop.entity;

/**
 * ͼƬ
 * @author letmetria
 *
 */
public class Image {
	private String imageid; 	// ��ʶ
	private String imagename;
	private String imgurl; 		// �洢��ַ
	private String suffix; 		// ��׺
	private String phoneid;
	public String getImageid() {
		return imageid;
	}
	public void setImageid(String imageid) {
		this.imageid = imageid;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}

}
