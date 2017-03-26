package shop.dao;

import shop.entity.Image;

public interface ImageDao {
	public void add(Image image);
	
	public Image getImage(String imageid);
}
