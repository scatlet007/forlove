package shop.utils;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizationInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 4949812834762901805L;
	public String actionName;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession();
		boolean flag = false;// 如果有权限访问设置为true；
		//不需要拦截验证的action名
		String[] actions={"user_login","admin_toLogin","admin_login"};
		// 取得请求的Action名
		actionName = invocation.getInvocationContext().getName();
		System.out.println("当前action名->"+actionName);
		// 的名称，在xml中配置的
		for(String action:actions)
		{
			if(action.equals(actionName))
				return invocation.invoke();
		}
		// TODO 在这里判断用户是否已经登陆,更改此方法，
		// 根据角色来判断用户是否有权限来使用当前的URL（action）
		if (session == null) 
		{
			return "login_redir";
		} else 
		{
			return invocation.invoke();
		}
/*
		if (flag) {
			// log.debug("success auth");
			return invocation.invoke();
		} else {
			// 跳转到没有访问权限
			return "permit_view";
		}*/
	}

}
