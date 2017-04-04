package shop.entity;

/**
 * 评论信息
 * @author letmetria
 *
 */
public class Comment {
	
	private String commentid;	//标识
	private String userid;		//用户id
	private String content;		//评论内容
	private String preComment;	//前置评论
	private String phoneid;
	private Comment pre;
	
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
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public Comment getPre() {
		return pre;
	}
	public void setPre(Comment pre) {
		this.pre = pre;
	}
	
	
}
