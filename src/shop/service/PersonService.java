package shop.service;

import java.util.Date;
import java.util.UUID;

import shop.dao.impl.PersonDaoImpl;
import shop.entity.Person;

public class PersonService {
	private PersonDaoImpl personDaoImpl;

	public void setPersonDaoImpl(PersonDaoImpl personDaoImpl) {
		this.personDaoImpl = personDaoImpl;
	}
	
	public Person login(String username,String password)
	{
		return this.personDaoImpl.get(username, password);
	}
	
	public boolean checkName(String username){
		return this.personDaoImpl.checkName(username);
	}
	
	public boolean addPerson(Person p)
	{
		p.setUserid("P"+new Date().getTime());
		return this.personDaoImpl.add(p);
	}
}
