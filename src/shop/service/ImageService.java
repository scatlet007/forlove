package shop.service;

import shop.dao.ImageDao;
import shop.dao.ImgsDao;

public class ImageService {
	private ImageDao imageDao;
	private ImgsDao imgsDao;

	public ImgsDao getImgsDao() {
		return imgsDao;
	}

	public void setImgsDao(ImgsDao imgsDao) {
		this.imgsDao = imgsDao;
	}

	public void setImageDao(ImageDao imageDao) {
		this.imageDao = imageDao;
	}
	
	public void bind(String phoneid,String imageid)
	{
		imgsDao.bind(phoneid, imageid);
	}
}
