package shop.dao;

import shop.entity.Admin;

public interface AdminDao {
	
	/**
	 * 通过名字和密码查询管理员
	 * @param adminname 名字
	 * @param password 密码
	 * @return
	 */
	public Admin findByNameAndPassword(String adminname,String password);
}
