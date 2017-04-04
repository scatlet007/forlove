package shop.service;

import shop.dao.CommentDao;
import shop.entity.Comment;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;

public class CommentService 
{
	private CommentDao commentDao;

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	public void saveComment(Comment comment)
	{
		commentDao.save(comment);
	}
	
	public void deleteComment(String commentid)
	{
		commentDao.delete(commentid);
	}
	
	public PagesBean<Comment> pageQuery(String phoneid,QueryInfo info)
	{
		QueryResult<Comment> result=commentDao.pageQuery(phoneid, info.getStartindex(), info.getPagesize());
		PagesBean<Comment> bean=new PagesBean<Comment>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(result.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(result.getTotalrecord());
		return bean;
	}
}
