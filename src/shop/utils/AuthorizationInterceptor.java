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
		boolean flag = false;// �����Ȩ�޷�������Ϊtrue��
		//����Ҫ������֤��action��
		String[] actions={"user_login","admin_toLogin","admin_login"};
		// ȡ�������Action��
		actionName = invocation.getInvocationContext().getName();
		System.out.println("��ǰaction��->"+actionName);
		// �����ƣ���xml�����õ�
		for(String action:actions)
		{
			if(action.equals(actionName))
				return invocation.invoke();
		}
		// TODO �������ж��û��Ƿ��Ѿ���½,���Ĵ˷�����
		// ���ݽ�ɫ���ж��û��Ƿ���Ȩ����ʹ�õ�ǰ��URL��action��
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
			// ��ת��û�з���Ȩ��
			return "permit_view";
		}*/
	}

}
