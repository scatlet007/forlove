package shop.dao;

import shop.entity.Person;

public interface PersonDao {
	
	/**
	 * ���һ���û�
	 * @param p
	 */
	public boolean add(Person p);
	
	/**
	 * ��¼��
	 * @param username �û���
	 * @param password ����
	 * @return
	 */
	public Person get(String username,String password);
	
	/**
	 * �����û����Ƿ��ظ�
	 * @param username �������û���
	 * @return
	 */
	public boolean checkName(String username);
	
	
}
