package shop.dao;

import java.util.List;

import shop.entity.Image;

public interface ImageDao {
	
	public void add(Image image);
	
	public void remove(String imageid);
	
	public Image getImage(String imageid);
	
	public List<Image> get(String phoneid);
}
