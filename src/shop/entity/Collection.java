package shop.entity;

/**
 * 收藏
 * @author letmetria
 *
 */
public class Collection {
	private String collectionid;//标识
	private String phoneid;	//商品标识
	private String userid;	//用户标识
	private String tag;		//关联的标签id
	
	public String getCollectionid() {
		return collectionid;
	}
	public void setCollectionid(String collectionid) {
		this.collectionid = collectionid;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
}
