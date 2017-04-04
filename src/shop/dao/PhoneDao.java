package shop.dao;

import java.util.List;

import shop.entity.Image;
import shop.entity.Phone;
import shop.entity.QueryResult;
import shop.view.model.PhoneListItem;
import shop.view.model.PhoneTag;

public interface PhoneDao {
	
	public void add(Phone p);
	
	public List<Phone> getAll();
	
	public List<PhoneTag> getRecommend();
	
	public List<PhoneTag> getHostPhone();
	
	public Phone getPhoneInfo(String phoneid);
	
	public QueryResult<PhoneTag> search(String s,int startindex,int pagesize);
	
	public QueryResult<PhoneTag> find(String sql,int startindex,int pagesize);
	
	public QueryResult<PhoneListItem> getPhoneList(int startindex,int pagesize);
}
