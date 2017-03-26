package shop.dao.impl;

import java.util.Date;

import shop.dao.BaseDao;
import shop.dao.ImgsDao;
import shop.entity.Imgs;

public class ImgsDaoImpl implements ImgsDao{
	
	private BaseDao baseDao;
	public BaseDao getBaseDao() {
		return baseDao;
	}
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public void bind(String phoneid, String imageid) {
		Date date=new Date();
		Imgs imgs=new Imgs();
		imgs.setImgsid("Imgs"+date.getTime());
		imgs.setImageid(imageid);
		imgs.setPhoneid(phoneid);
		baseDao.add(imgs);
	}
	
	public Imgs getImgs(String phoneid)
	{
		return baseDao.query("select * from t_imgs where phoneid=?", new Object[]{phoneid}, Imgs.class).get(0);
	}

}
