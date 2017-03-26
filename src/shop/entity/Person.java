package shop.entity;

/**
 * 个人信息
 * @author letmetria
 *
 */
public class Person {
	
	private String userid;		//标识
	private String username;	//用户名
	private String password;	//密码
	private String email;		//电子邮箱
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
