package shop.dao.impl;

import java.util.List;

import shop.dao.BaseDao;
import shop.dao.PersonDao;
import shop.entity.Person;

public class PersonDaoImpl implements PersonDao {

	/**
     * ³Ö¾Ã²ã²Ù×÷Àà
     */
    protected BaseDao baseDao;
    
    
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public boolean add(Person p) {
		try{
			baseDao.add(p);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Person get(String username, String password) {
		try {
			return baseDao.queryForObject(
					"select * from t_person where username=? and password=?",
					new Object[] { username, password }, Person.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean checkName(String username) {
		try {
			List<Person> list=baseDao.query("select * from t_person where username=?", new Object[]{username}, Person.class);
			if(list.size()==0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
