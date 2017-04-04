package shop.dao;

import shop.entity.Internet;

public interface InternetDao {
	public void save(Internet internet);
	
	public void delete(String internetid);
	
	public void update(Internet internet);
	
	public Internet get(String internetid);
	
	public Internet getByPhoneid(String phoneid);
}
