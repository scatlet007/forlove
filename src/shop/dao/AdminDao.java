package shop.dao;

import shop.entity.Admin;

public interface AdminDao {
	
	/**
	 * ͨ�����ֺ������ѯ����Ա
	 * @param adminname ����
	 * @param password ����
	 * @return
	 */
	public Admin findByNameAndPassword(String adminname,String password);
}
