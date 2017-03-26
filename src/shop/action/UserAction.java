package shop.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import shop.entity.Person;
import shop.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware{
	
	private Person p;
	private PersonService personService;
	private Map<String,Object> session;
	public UserAction()
	{
		this.dataMap = new HashMap<String, String>();
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public void setP(Person p) {
		this.p = p;
	}
	
	/**
	 * ��¼
	 * @return
	 */
	public String login()
	{
		HttpServletRequest request= ServletActionContext.getRequest();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username+"--------"+password);
		Person user=this.personService.login(username,password);
		String code=session.get("SESSION_SECURITY_CODE")+"";
		if(!code.equals(yzm))
			dataMap.put("yzm", "��֤���������");
		if(user==null)
			dataMap.put("user", "�û������������");
		else{
			
			request.getSession().setAttribute("userid", user.getUserid());
			request.getSession().setAttribute("username", user.getUsername());
			dataMap.put("isOK", "1");
		}
		return SUCCESS;
	}
	
	/**
	 * ע��
	 * @return
	 */
	public String register()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		p.setPassword(request.getParameter("p.password"));
		p.setEmail(request.getParameter("p.email"));
		p.setUsername(request.getParameter("p.username"));
		System.out.println(p.getUsername());
		String code=session.get("SESSION_SECURITY_CODE")+"";
		if(!code.equals(yzm))
		{
			dataMap.put("yzm", "��֤���������");
			return SUCCESS;
		}
		if(!this.personService.checkName(p.getUsername()))
		{
			dataMap.put("user","�û����ظ�");
			return SUCCESS;
		}
		if(this.personService.addPerson(p))
			dataMap.put("isOK", "1");
		return "success";
	}
	
	/**
	 * �˳���¼
	 * @return
	 */
	public String logout()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.getSession().invalidate();
		return "logout";
	}
	
	/**
	 * �һ�����
	 * @return
	 */
	public String findPwd()
	{
		return SUCCESS;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	private String yzm;
	public String getYzm() {
		return yzm;
	}
	public void setYzm(String yzm) {
		this.yzm = yzm;
	}
	private Map<String,String> dataMap;
	public Map<String, String> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}
}
