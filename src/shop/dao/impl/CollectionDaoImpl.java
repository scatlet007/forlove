package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.CollectionDao;
import shop.entity.Collection;
import shop.entity.QueryResult;

public class CollectionDaoImpl implements CollectionDao {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Collection collection) {
		baseDao.add(collection);
	}

	@Override
	public void remove(String collectionid) {
		baseDao.delete(Collection.class, collectionid);
	}

	@Override
	public QueryResult<Collection> pageQuery(String userid, int startindex,
			int pagesize) {
		QueryResult<Collection> queryResult = new QueryResult<Collection>();
		queryResult.setList(baseDao
				.query("select * from t_collection where userid=? litmit ?,?",
						new Object[] { userid, startindex, pagesize },
						Collection.class));
		queryResult.setTotalrecord(baseDao.query(
				"select * from t_collection where userid=?",
				new Object[] { userid }, Collection.class).size());
		return queryResult;
	}

	@Override
	public QueryResult<Collection> pageQuery(String userid, String tagid,
			int startindex, int pagesize) {
		QueryResult<Collection> queryResult = new QueryResult<Collection>();
		queryResult
				.setList(baseDao
						.query("select * from t_collection where userid=? and tag=? litmit ?,?",
								new Object[] { userid, tagid, startindex,
										pagesize }, Collection.class));
		queryResult.setTotalrecord(baseDao.query(
				"select * from t_collection where userid=? and tag=?",
				new Object[] { userid, tagid }, Collection.class).size());
		return queryResult;
	}

}
