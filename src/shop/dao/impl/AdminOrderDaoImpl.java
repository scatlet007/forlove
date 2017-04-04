package shop.dao.impl;

import shop.dao.AdminOrderDao;
import shop.dao.BaseDao;
import shop.entity.AdminOrder;
import shop.entity.QueryResult;

public class AdminOrderDaoImpl implements AdminOrderDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(AdminOrder order) {
		baseDao.add(order);
	}

	@Override
	public void delete(String orderid) {
		baseDao.delete(AdminOrder.class, orderid);
	}

	@Override
	public void update(AdminOrder order) {
		baseDao.update(order);
	}

	@Override
	public AdminOrder getById(String orderid) {
		return baseDao.getByHibernate(AdminOrder.class, orderid);
	}

	@Override
	public QueryResult<AdminOrder> getByDate(String date, int startindex,
			int pagesize) {
		QueryResult<AdminOrder> queryResult = new QueryResult<AdminOrder>();
		queryResult.setList(baseDao.query(
				"select * from t_adminorder where ordertime=? limit ?,?",
				new Object[] { date, startindex, pagesize }, AdminOrder.class));
		queryResult.setTotalrecord(baseDao.query(
				"select * from t_adminorder where ordertime=?",
				new Object[] { date }, AdminOrder.class).size());
		return queryResult;
	}

	@Override
	public QueryResult<AdminOrder> getByManager(String adminname,
			int startindex, int pagesize) {
		QueryResult<AdminOrder> queryResult = new QueryResult<AdminOrder>();
		queryResult
				.setList(baseDao
						.query("select a.orderid,a.ordertime,a.total,a.address,a.adminid from t_adminorder a where a.adminid in(select adminid from admin where adminname=?) limit ?,?",
								new Object[] { adminname, startindex, pagesize },
								AdminOrder.class));
		queryResult
				.setTotalrecord(baseDao
						.query("select a.orderid,a.ordertime,a.total,a.address,a.adminid from t_adminorder a where a.adminid in(select adminid from admin where adminname=?)",
								AdminOrder.class).size());
		return queryResult;
	}

	@Override
	public QueryResult<AdminOrder> pageQuery(int startindex, int pagesize) {
		QueryResult<AdminOrder> queryResult = new QueryResult<AdminOrder>();
		queryResult
				.setList(baseDao
						.query("select a.orderid,a.ordertime,a.total,a.address,a.adminid from t_adminorder a limit ?,?",
								new Object[] { startindex, pagesize },
								AdminOrder.class));
		queryResult
				.setTotalrecord(baseDao
						.query("select a.orderid,a.ordertime,a.total,a.address,a.adminid from t_adminorder a ",
								AdminOrder.class).size());
		return queryResult;
	}

}
