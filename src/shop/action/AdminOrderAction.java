package shop.action;

import org.apache.struts2.ServletActionContext;

import shop.entity.AdminOrder;
import shop.entity.AdminOrderItem;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.service.AdminOrderService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminOrderAction extends ActionSupport {
	
	private PagesBean<AdminOrder> pagesBean;
	private QueryInfo info;
	private AdminOrder adminOrder;
	private AdminOrderItem adminOrderItem;
	private String orderid;
	private String itemid;
	private String[] orderids;
	private String[] itemids;
	private AdminOrderService adminOrderService;
	public PagesBean<AdminOrder> getPagesBean() {
		return pagesBean;
	}
	public void setPagesBean(PagesBean<AdminOrder> pagesBean) {
		this.pagesBean = pagesBean;
	}
	public QueryInfo getInfo() {
		return info;
	}
	public void setInfo(QueryInfo info) {
		this.info = info;
	}
	public AdminOrder getAdminOrder() {
		return adminOrder;
	}
	public void setAdminOrder(AdminOrder adminOrder) {
		this.adminOrder = adminOrder;
	}
	public AdminOrderItem getAdminOrderItem() {
		return adminOrderItem;
	}
	public void setAdminOrderItem(AdminOrderItem adminOrderItem) {
		this.adminOrderItem = adminOrderItem;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String[] getOrderids() {
		return orderids;
	}
	public void setOrderids(String[] orderids) {
		this.orderids = orderids;
	}
	public String[] getItemids() {
		return itemids;
	}
	public void setItemids(String[] itemids) {
		this.itemids = itemids;
	}
	public void setAdminOrderService(AdminOrderService adminOrderService) {
		this.adminOrderService = adminOrderService;
	}
	
	public String saveAdminOrder()
	{
		adminOrderService.saveAdminOrder(adminOrder);
		return "saveAdminOrder";
	}
	
	public String deleteAdminOrder()
	{
		adminOrderService.deleteAdminOrder(orderid);
		return "deleteAdminOrder";
	}
	
	public String deleteAdminOrders()
	{
		adminOrderService.deleteAdminOrder(orderids);
		return "deleteAdminOrders";
	}
	
	public String updateAdminOrder()
	{
		adminOrderService.updateAdminOrder(adminOrder);
		return "updateAdminOrder";
	}
	
	public String saveAdminOrderItem()
	{
		adminOrderService.saveAdminOrderItem(adminOrderItem);
		return "saveAdminOrderItem";
	}
	
	public String updateAdminOrderItems()
	{
		adminOrderService.updateAdminOrderItem(adminOrderItem);
		return "updateAdminOrderItems";
	}
	
	public String getAdminOrderById()
	{
		adminOrder=adminOrderService.getAdminOrderById(orderid);
		return "getAdminOrderById";
	}
	
	public String getAdminOrderByDate()
	{
		String date=ServletActionContext.getRequest().getParameter("date");
		pagesBean=adminOrderService.getAdminOrderByDate(date, info);
		return "getAdminOrderByDate";
	}
}
