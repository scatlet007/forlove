package shop.service;

import shop.dao.AdminDao;
import shop.entity.Admin;

public class AdminService {
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	public Admin login(String adminname,String password)
	{
		return adminDao.findByNameAndPassword(adminname, password);
	}
}
