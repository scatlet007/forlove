package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.InternetDao;
import shop.entity.Internet;

public class InternetDaoImpl implements InternetDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Internet internet) {
		baseDao.add(internet);

	}

	@Override
	public void delete(String internetid) {
		baseDao.delete(Internet.class, internetid);

	}

	@Override
	public void update(Internet internet) {
		baseDao.update(internet);

	}

	@Override
	public Internet get(String internetid) {
		return baseDao.getByHibernate(Internet.class, internetid);
	}

	@Override
	public Internet getByPhoneid(String phoneid) {
		return baseDao.queryForObjectHQL(
				"select * from t_internet where phoneid=?",
				new Object[] { phoneid });
	}

}
