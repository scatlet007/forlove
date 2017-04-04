package shop.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.ActionSupport;

import shop.entity.Brand;
import shop.entity.Camera;
import shop.entity.DIY;
import shop.entity.Internet;
import shop.entity.NetItem;
import shop.entity.PagesBean;
import shop.entity.Phone;
import shop.entity.QueryInfo;
import shop.entity.Screen;
import shop.entity.Support;
import shop.service.PhoneService;
import shop.utils.Common;
import shop.view.model.PhoneListItem;

public class GoodsAction extends ActionSupport {
	private PhoneService phoneService;
	private Phone phone;
	private Camera camera;
	private DIY diy;
	private Internet internet;
	private NetItem item;
	private Screen screen;
	private Support support;
	private PagesBean<PhoneListItem> pagesBean;
	private QueryInfo queryInfo;
	public Phone getPhone() 
	{
		return phone;
	}

	public void setPhone(Phone phone) 
	{
		this.phone = phone;
	}

	public Camera getCamera() 
	{
		return camera;
	}

	public void setCamera(Camera camera) 
	{
		this.camera = camera;
	}

	public DIY getDiy() 
	{
		return diy;
	}

	public void setDiy(DIY diy) 
	{
		this.diy = diy;
	}

	public Internet getInternet() 
	{
		return internet;
	}

	public void setInternet(Internet internet) 
	{
		this.internet = internet;
	}

	public NetItem getItem() 
	{
		return item;
	}

	public void setItem(NetItem item) 
	{
		this.item = item;
	}

	public Screen getScreen() 
	{
		return screen;
	}

	public void setScreen(Screen screen) 
	{
		this.screen = screen;
	}

	public Support getSupport() 
	{
		return support;
	}

	public void setSupport(Support support) 
	{
		this.support = support;
	}

	public PagesBean<PhoneListItem> getPagesBean() {
		return pagesBean;
	}

	public void setPagesBean(PagesBean<PhoneListItem> pagesBean) {
		this.pagesBean = pagesBean;
	}

	public QueryInfo getQueryInfo() {
		return queryInfo;
	}

	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

	public void setPhoneService(PhoneService phoneService) 
	{
		this.phoneService = phoneService;
	}
	
	public String toAddPhone()
	{
		return "toAddPhone";
	}
	
	public String add()
	{
		this.phoneService.save(phone);
		return "json";
	}
	
	public String listPhone()
	{
		QueryInfo info=new QueryInfo();
		if(queryInfo!=null)
			info=queryInfo;
		PagesBean<PhoneListItem> bean=new PagesBean<PhoneListItem>();
		bean=phoneService.getPhoneList(info);
		ServletActionContext.getRequest().setAttribute("pagebean", bean);
		return "listPhone";
	}
	
	public String toAddPhoneDesc()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		String phoneid=request.getParameter("phoneid");
		request.setAttribute("phoneid", phoneid);
		return "toAddPhoneDesc";
	}
}
