package shop.dao;

import java.util.List;

import shop.entity.NetItem;

public interface NetItemDao {
	
	public void save(NetItem item);
	
	public void remove(String itemid);
	
	public void update(NetItem item);
	
	public List<NetItem> get(String phoneid);
}
