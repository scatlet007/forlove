package shop.entity;

/**
 * ������Ϣ
 * @author letmetria
 *
 */
public class Comment {
	
	private String commentid;	//��ʶ
	private String userid;		//�û�id
	private String content;		//��������
	private String preComment;	//ǰ������
	
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPreComment() {
		return preComment;
	}
	public void setPreComment(String preComment) {
		this.preComment = preComment;
	}
	
	
}
