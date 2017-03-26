package shop.dao;

import shop.entity.Imgs;

public interface ImgsDao {
	
	public void bind(String phoneid,String imageid);
	
	public Imgs getImgs(String phoneid);
}
