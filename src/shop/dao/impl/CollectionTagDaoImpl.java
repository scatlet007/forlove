package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.CollectionTagDao;
import shop.entity.CollectionTag;

public class CollectionTagDaoImpl implements CollectionTagDao {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(CollectionTag collectionTag) {
		baseDao.add(collectionTag);

	}

	@Override
	public void delete(String collectionTagid) {
		baseDao.delete(CollectionTag.class, collectionTagid);

	}

	@Override
	public List<CollectionTag> get(String userid) {
		return baseDao.query("select * from t_collectionTag where userid=?",
				new Object[] { userid }, CollectionTag.class);
	}

}
