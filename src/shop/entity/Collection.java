package shop.entity;

/**
 * �ղ�
 * @author letmetria
 *
 */
public class Collection {
	private String collectionid;//��ʶ
	private String phoneid;	//��Ʒ��ʶ
	private String userid;	//�û���ʶ
	private String tag;		//�����ı�ǩid
	
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
