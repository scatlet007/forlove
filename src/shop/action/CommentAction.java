package shop.action;

import shop.service.CommentService;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport{
	private CommentService commentService;

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}
	
}
