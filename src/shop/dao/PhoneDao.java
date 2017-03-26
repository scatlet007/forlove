package shop.dao;

import java.util.List;

import shop.entity.Phone;

public interface PhoneDao {
	
	public void add(Phone p);
	
	public List<Phone> getAll();
}
