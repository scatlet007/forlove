package shop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BaseDao;
import shop.dao.CommentDao;
import shop.entity.Comment;
import shop.entity.QueryResult;

public class CommentDaoImpl implements CommentDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Comment comment) {
		baseDao.add(comment);

	}

	@Override
	public void delete(String commentid) {
		baseDao.delete(Comment.class, commentid);

	}

	@Override
	public QueryResult<Comment> pageQuery(String phoneid, int startindex,
			int pagesize) {
		QueryResult<Comment> queryResult = new QueryResult<Comment>();
		List<Comment> list = baseDao.query(
				"select * from t_comment where phoneid=? litmit ?,?",
				new Object[] { phoneid, startindex, pagesize }, Comment.class);
		queryResult.setTotalrecord(baseDao.query(
				"select * from t_comment where phoneid=?",
				new Object[] { phoneid, }, Comment.class).size());
		List<Comment> result = new ArrayList<Comment>();
		for (Comment item : list) {
			if (item.getPreComment() != null) {
				Comment comment = baseDao.getByHibernate(Comment.class,
						item.getPreComment());
				item.setPre(comment);
			}
			result.add(item);
		}
		queryResult.setList(result);
		return null;
	}
}
