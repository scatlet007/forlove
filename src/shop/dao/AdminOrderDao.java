package shop.dao;

import shop.entity.AdminOrder;
import shop.entity.QueryResult;

public interface AdminOrderDao {
	
	public void save(AdminOrder order);
	
	public void delete(String orderid);
	
	public void update(AdminOrder order);
	
	public AdminOrder getById(String orderid);
	
	public QueryResult<AdminOrder> getByDate(String date,int startindex,int pagesize);
	
	public QueryResult<AdminOrder> getByManager(String adminname,int startindex,int pagesize);
	
	public QueryResult<AdminOrder> pageQuery(int startindex,int pagesize);
}
