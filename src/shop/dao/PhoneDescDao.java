package shop.dao;

import shop.entity.PhoneDesc;

public interface PhoneDescDao {
	
	public void add(PhoneDesc phoneDesc);
	
	public PhoneDesc get(String phoneid);
}
