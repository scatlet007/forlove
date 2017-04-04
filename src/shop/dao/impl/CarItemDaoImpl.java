package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.CarItemDao;
import shop.entity.CarItem;

public class CarItemDaoImpl implements CarItemDao {
	
	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(CarItem item) {
		baseDao.add(item);
	}

	@Override
	public void remove(String itemid) {
		baseDao.delete(CarItem.class, itemid);
	}

	@Override
	public void delete(String userid) {
		String sql="delete table t_caritem where userid=?";
		baseDao.update(sql,new Object[]{userid});
	}

	@Override
	public CarItem getById(String itemid) {
		return baseDao.getByHibernate(CarItem.class, itemid);
	}

	@Override
	public List<CarItem> get(String userid) {
		String sql="delete table t_caritem where userid=?";
		return baseDao.query(sql, new Object[]{userid}, CarItem.class);
	}

	@Override
	public List<CarItem> getByOrderId(String orderid) {
		String sql="select * from t_caritem where orderid=?";
		return baseDao.query(sql, new Object[]{orderid}, CarItem.class);
	}

}
