package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.OrderDao;
import shop.entity.Order;

public class OrderDaoImpl implements OrderDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Order order) {
		baseDao.add(order);

	}

	@Override
	public void update(Order order) {
		baseDao.update(order);

	}

	@Override
	public void delete(String orderid) {
		baseDao.delete(Order.class, orderid);

	}

	@Override
	public List<Order> get(String userid) {
		return baseDao.query("select * from t_order where userid=?",
				new Object[] { userid }, Order.class);
	}

}
