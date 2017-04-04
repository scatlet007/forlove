package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.NetItemDao;
import shop.entity.NetItem;

public class NetItemDaoImpl implements NetItemDao {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(NetItem item) {
		baseDao.add(item);

	}

	@Override
	public void remove(String itemid) {
		baseDao.delete(NetItem.class, itemid);

	}

	@Override
	public void update(NetItem item) {
		baseDao.update(item);

	}

	@Override
	public List<NetItem> get(String phoneid) {
		return baseDao.query("select * from t_netitem where phoneid=?",
				new Object[] { phoneid }, NetItem.class);
	}

}
