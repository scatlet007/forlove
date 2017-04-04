package shop.dao;

import java.util.List;

import shop.entity.CollectionTag;

public interface CollectionTagDao {
	
	public void save(CollectionTag collectionTag);
	
	public void delete(String collectionTagid);
	
	public List<CollectionTag> get(String userid);
	
}
