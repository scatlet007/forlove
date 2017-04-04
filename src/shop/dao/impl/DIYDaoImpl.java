package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.DIYDao;
import shop.entity.DIY;

public class DIYDaoImpl implements DIYDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(DIY diy) {
		baseDao.add(diy);

	}

	@Override
	public void delete(String id) {
		baseDao.delete(DIY.class, id);

	}

	@Override
	public void update(DIY diy) {
		baseDao.update(diy);

	}

	@Override
	public DIY get(String phoneid) {
		return baseDao.query("select * from t_DIY where phoneid=?",
				new Object[] { phoneid }, DIY.class).get(0);
	}

}
