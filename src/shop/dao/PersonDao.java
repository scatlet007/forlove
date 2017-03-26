package shop.dao;

import shop.entity.Person;

public interface PersonDao {
	
	/**
	 * 添加一个用户
	 * @param p
	 */
	public boolean add(Person p);
	
	/**
	 * 登录用
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	public Person get(String username,String password);
	
	/**
	 * 检验用户名是否重复
	 * @param username 被检验用户名
	 * @return
	 */
	public boolean checkName(String username);
	
	
}
