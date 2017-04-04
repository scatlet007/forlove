package shop.service;

import java.util.List;

import shop.dao.ImageDao;
import shop.entity.Image;

public class ImageService {
	private ImageDao imageDao;

	public void setImageDao(ImageDao imageDao) {
		this.imageDao = imageDao;
	}
	
	public void addImage(Image image)
	{
		imageDao.add(image);
	}
	
	public void remove(String imageid)
	{
		imageDao.remove(imageid);
	}
	
	public Image getImage(String imageid)
	{
		return imageDao.getImage(imageid);
	}
	
	public List<Image> get(String phoneid)
	{
		return imageDao.get(phoneid);
	}
}
