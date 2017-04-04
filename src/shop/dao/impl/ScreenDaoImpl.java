package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.ScreenDao;
import shop.entity.Screen;

public class ScreenDaoImpl implements ScreenDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Screen screen) {
		baseDao.add(screen);

	}

	@Override
	public void delete(String id) {
		baseDao.delete(Screen.class, id);

	}

	@Override
	public void update(Screen screen) {
		baseDao.update(screen);

	}

	@Override
	public Screen get(String phoneid) {
		return baseDao.queryForObjectHQL(
				"select * from t_screen where phoneid=?",
				new Object[] { phoneid });
	}

}
