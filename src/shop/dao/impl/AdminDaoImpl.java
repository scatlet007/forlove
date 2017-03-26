package shop.dao.impl;

import shop.dao.AdminDao;
import shop.dao.BaseDao;
import shop.entity.Admin;

public class AdminDaoImpl implements AdminDao{
	
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public Admin findByNameAndPassword(String adminname, String password) {
		try {
			return baseDao.queryForObject(
					"select * from t_admin where adminname=? and password=?",
					new Object[] { adminname, password }, Admin.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
