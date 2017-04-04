package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.SupportDao;
import shop.entity.Support;

public class SupportDaoImpl implements SupportDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Support support) {
		baseDao.add(support);

	}

	@Override
	public void delete(String id) {
		baseDao.delete(Support.class, id);

	}

	@Override
	public void update(Support support) {
		baseDao.update(support);

	}

	@Override
	public Support get(String phoneid) {
		return baseDao.queryForObjectHQL(
				"select * from t_support where phoneid=?",
				new Object[] { phoneid });
	}

}
