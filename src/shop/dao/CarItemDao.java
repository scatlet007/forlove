package shop.dao;

import java.util.List;

import shop.entity.CarItem;

public interface CarItemDao {
	
	public void save(CarItem item);
	
	public void remove(String itemid);
	
	public void delete(String userid);
	
	public CarItem getById(String itemid);
	
	public List<CarItem> getByOrderId(String orderid);
	
	public List<CarItem> get(String userid);
}
