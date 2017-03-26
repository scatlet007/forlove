package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.PhoneDescDao;
import shop.entity.PhoneDesc;

public class PhoneDescDaoImpl implements PhoneDescDao{
	
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(PhoneDesc phoneDesc) {
		baseDao.add(phoneDesc);
	}

	@Override
	public PhoneDesc get(String phoneid) {
		List<PhoneDesc> phoneDescs=baseDao.query("select * from t_phonedesc where phoneid=?", new Object[]{phoneid}, PhoneDesc.class);
		if(phoneDescs.size()>0)
			return phoneDescs.get(0);
		return null;
	}
	
}
