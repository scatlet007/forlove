package shop.entity;

/**
 * 收藏标签
 * @author letmetria
 *
 */
public class CollectionTag {
	private String tagid;		//标识
	private String tagname;	//名称
	private String userid;	//关联用户
	public String getTagid() {
		return tagid;
	}
	public void setTagid(String tagid) {
		this.tagid = tagid;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
