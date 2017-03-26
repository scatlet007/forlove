package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.PhoneDao;
import shop.entity.Phone;

public class PhoneDaoImpl implements PhoneDao{
	
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(Phone p) {
		baseDao.add(p);
	}

	@Override
	public List<Phone> getAll() {
		return baseDao.query("select * from t_phone", Phone.class);
	}
}
