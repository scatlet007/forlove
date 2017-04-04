package shop.service;

import shop.dao.AdminOrderDao;
import shop.dao.AdminOrderItemDao;
import shop.entity.AdminOrder;
import shop.entity.AdminOrderItem;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;

public class AdminOrderService 
{
	private AdminOrderDao adminOrderDao;
	private AdminOrderItemDao adminOrderItemDao;
	
	public void setAdminOrderDao(AdminOrderDao adminOrderDao) {
		this.adminOrderDao = adminOrderDao;
	}

	public void setAdminOrderItemDao(AdminOrderItemDao adminOrderItemDao) {
		this.adminOrderItemDao = adminOrderItemDao;
	}

	public void saveAdminOrder(AdminOrder order)
	{
		adminOrderDao.save(order);
	}
	
	public void deleteAdminOrder(String orderid)
	{
		adminOrderDao.delete(orderid);
	}
	
	public void deleteAdminOrder(String[] orderids)
	{
		for(String orderid:orderids)
			adminOrderDao.delete(orderid);
	}
	
	public void updateAdminOrder(AdminOrder order)
	{
		adminOrderDao.update(order);
	}
	
	public AdminOrder getAdminOrderById(String orderid)
	{
		return adminOrderDao.getById(orderid);
	}
	
	public PagesBean<AdminOrder> getAdminOrderByDate(String date,QueryInfo info)
	{
		QueryResult<AdminOrder> result=adminOrderDao.getByDate(date, info.getStartindex(), info.getPagesize());
		PagesBean<AdminOrder> pagesBean=new PagesBean<AdminOrder>();
		pagesBean.setCurrentpage(info.getCurrentpage());
		pagesBean.setList(result.getList());
		pagesBean.setPagesize(info.getPagesize());
		pagesBean.setTotalrecord(result.getTotalrecord());
		return pagesBean;
	}
	
	public PagesBean<AdminOrder> getAdminOrderByManager(String adminname,QueryInfo info)
	{
		QueryResult<AdminOrder> result=adminOrderDao.getByManager(adminname, info.getStartindex(), info.getPagesize());
		PagesBean<AdminOrder> pagesBean=new PagesBean<AdminOrder>();
		pagesBean.setCurrentpage(info.getCurrentpage());
		pagesBean.setList(result.getList());
		pagesBean.setPagesize(info.getPagesize());
		pagesBean.setTotalrecord(result.getTotalrecord());
		return pagesBean;
	}
	
	public PagesBean<AdminOrder> pageQuery(QueryInfo info)
	{
		QueryResult<AdminOrder> result=adminOrderDao.pageQuery(info.getStartindex(), info.getPagesize());
		PagesBean<AdminOrder> pagesBean=new PagesBean<AdminOrder>();
		pagesBean.setCurrentpage(info.getCurrentpage());
		pagesBean.setList(result.getList());
		pagesBean.setPagesize(info.getPagesize());
		pagesBean.setTotalrecord(result.getTotalrecord());
		return pagesBean;
	}
	
	public void saveAdminOrderItem(AdminOrderItem item)
	{
		adminOrderItemDao.save(item);
	}
	
	public void removeAdminOrderItem(String itemid)
	{
		adminOrderItemDao.remove(itemid);
	}
	
	public void removeAdminOrderItem(String[] itemids)
	{
		for(String itemid:itemids)
			adminOrderItemDao.remove(itemid);
	}
	
	public void updateAdminOrderItem(AdminOrderItem item)
	{
		adminOrderItemDao.update(item);
	}
	
	public AdminOrderItem getAdminOrderItemById(String itemid)
	{
		return adminOrderItemDao.getById(itemid);
	}
	
	public PagesBean<AdminOrderItem> pageQuery(String orderid,QueryInfo info)
	{
		QueryResult<AdminOrderItem> result=adminOrderItemDao.pageQuery(orderid, info.getStartindex(), info.getPagesize());
		PagesBean<AdminOrderItem> pagesBean=new PagesBean<AdminOrderItem>();
		pagesBean.setCurrentpage(info.getCurrentpage());
		pagesBean.setList(result.getList());
		pagesBean.setPagesize(info.getPagesize());
		pagesBean.setTotalrecord(result.getTotalrecord());
		return pagesBean;
	}
}
