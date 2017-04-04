package shop.dao.impl;

import java.util.List;

import org.omg.CORBA.BAD_CONTEXT;

import shop.dao.BaseDao;
import shop.dao.ImageDao;
import shop.entity.Image;

public class ImageDaoImpl implements ImageDao {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(Image image) {
		baseDao.add(image);
	}

	public Image getImage(String imageid) {
		return baseDao.getByHibernate(Image.class, imageid);
	}

	@Override
	public void remove(String imageid) {
		baseDao.delete(Image.class, imageid);
	}

	@Override
	public List<Image> get(String phoneid) {
		return baseDao.query("select * from t_image where phoneid=?",
				new Object[] { phoneid }, Image.class);
	}
}
