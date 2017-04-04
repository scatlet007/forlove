package shop.service;

import java.util.List;

import shop.dao.CarItemDao;
import shop.entity.CarItem;

public class CarItemService 
{
	private CarItemDao carItemDao;

	public void setCarItemDao(CarItemDao carItemDao) {
		this.carItemDao = carItemDao;
	}
	
	public void save(CarItem item)
	{
		carItemDao.save(item);
	}
	
	public void remove(String itemid)
	{
		carItemDao.remove(itemid);
	}
	
	public void delete(String userid)
	{
		carItemDao.delete(userid);
	}
	
	public List<CarItem> getByOrderId(String orderid)
	{
		return carItemDao.getByOrderId(orderid);
	}
	
	public List<CarItem> get(String userid)
	{
		return carItemDao.get(userid);
	}

}
