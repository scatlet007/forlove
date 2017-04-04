package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.OrderItemDao;
import shop.entity.OrderItem;

public class OrderItemDaoImpl implements OrderItemDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(OrderItem item) {
		baseDao.add(item);

	}

	@Override
	public void remove(String itemid) {
		baseDao.delete(OrderItem.class, itemid);

	}

	@Override
	public List<OrderItem> get(String orderid) {
		return baseDao.query("select * from t_orderitem where orderid=?",
				new Object[] { orderid }, OrderItem.class);
	}

}
