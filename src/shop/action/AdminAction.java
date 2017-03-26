package shop.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import shop.entity.Admin;
import shop.service.AdminService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	private AdminService adminService;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	private Admin admin;
	private Map<String,Object> dataMap;
	
	public AdminAction()
	{
		this.dataMap=new HashMap<String, Object>();
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	/**
	 * 跳到登录页面
	 * @return
	 */
	public String toLogin()
	{
		return "toLogin";
	}
	/**
	 * 管理员登录
	 * @return
	 */
	public String login()
	{
		System.out.println(admin.getAdminname()+"---->"+ admin.getPassword());
		Admin theAdmin=adminService.login(admin.getAdminname(), admin.getPassword());
		if(theAdmin==null)
		{
			dataMap.put("user", "用户名或密码错误");
		}
		else
		{
			ServletActionContext.getRequest().getSession().setAttribute("theAdmin", theAdmin);
			dataMap.put("isOK", "ok");
		}
		return "success";
	}
	
	/**
	 * 管理员登出
	 * @return
	 */
	public String logout()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.getSession().invalidate();
		return "logout";
	}
}
