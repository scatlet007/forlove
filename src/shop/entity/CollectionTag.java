package shop.entity;

/**
 * 收藏标签
 * @author letmetria
 *
 */
public class CollectionTag {
	private String tagid;		//标识
	private String name;	//名称
	private String userid;	//关联用户
	
	public String getTagId() {
		return tagid;
	}
	public void setTagId(String id) {
		this.tagid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
