package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.ImageDao;
import shop.entity.Image;

public class ImageDaoImpl implements ImageDao{
	
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(Image image) {
		baseDao.add(image);
	}
	
	public Image getImage(String imageid)
	{
		return baseDao.getByHibernate(Image.class, imageid);
	}
}
