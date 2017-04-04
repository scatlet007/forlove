package shop.dao;

import shop.entity.Comment;
import shop.entity.QueryResult;

public interface CommentDao {
	
	public void save(Comment comment);
	
	public void delete(String commentid);
	
	public QueryResult<Comment> pageQuery(String phoneid,int startindex,int pagesize);
}
