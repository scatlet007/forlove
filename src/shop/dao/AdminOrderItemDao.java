package shop.dao;

import shop.entity.AdminOrderItem;
import shop.entity.QueryResult;

public interface AdminOrderItemDao {
	
	public void save(AdminOrderItem item);
	
	public void remove(String itemid);
	
	public void update(AdminOrderItem item);
	
	public AdminOrderItem getById(String itemid);
	
	public QueryResult<AdminOrderItem> pageQuery(String orderid,int startindex,int pagesize);
}
