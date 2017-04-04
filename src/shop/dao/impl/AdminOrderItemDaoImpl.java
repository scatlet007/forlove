package shop.dao.impl;

import shop.dao.AdminOrderItemDao;
import shop.dao.BaseDao;
import shop.entity.AdminOrderItem;
import shop.entity.QueryResult;

public class AdminOrderItemDaoImpl implements AdminOrderItemDao {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(AdminOrderItem item) {
		baseDao.add(item);
	}

	@Override
	public void remove(String itemid) {
		baseDao.delete(AdminOrderItem.class, itemid);
	}

	@Override
	public void update(AdminOrderItem item) {
		baseDao.update(item);
	}

	@Override
	public AdminOrderItem getById(String itemid) {
		return baseDao.getByHibernate(AdminOrderItem.class, itemid);
	}

	@Override
	public QueryResult<AdminOrderItem> pageQuery(String orderid,
			int startindex, int pagesize) {
		QueryResult<AdminOrderItem> queryResult = new QueryResult<AdminOrderItem>();
		queryResult
				.setList(baseDao
						.query("select * from t_adminorderitem where adminorderid=? litmit ?,?",
								new Object[] { orderid, startindex, pagesize },
								AdminOrderItem.class));
		queryResult.setTotalrecord(baseDao.query(
				"select * from t_adminorderitem where adminorderid=?",
				new Object[] { orderid }, AdminOrderItem.class).size());
		return queryResult;
	}

}
