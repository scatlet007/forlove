package shop.dao;

import shop.entity.Support;

public interface SupportDao {
	
	public void save(Support support);
	
	public void delete(String id);
	
	public void update(Support support);
	
	public Support get(String phoneid);
}
