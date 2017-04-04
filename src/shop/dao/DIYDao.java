package shop.dao;

import shop.entity.DIY;

public interface DIYDao {
	
	public void save(DIY diy);
	
	public void delete(String id);
	
	public void update(DIY diy);
	
	public DIY get(String phoneid);
}
