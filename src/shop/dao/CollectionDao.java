package shop.dao;

import shop.entity.Collection;
import shop.entity.QueryResult;


public interface CollectionDao {
	
	public void save(Collection collection);
	
	public void remove(String collectionid);
	
	public QueryResult<Collection> pageQuery(String userid,int startindex,int pagesize);
	
	public QueryResult<Collection> pageQuery(String userid,String tagid,int startindex,int pagesize);
}
