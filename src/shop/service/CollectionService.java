package shop.service;

import java.util.List;

import shop.dao.CollectionDao;
import shop.dao.CollectionTagDao;
import shop.entity.Collection;
import shop.entity.CollectionTag;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;

public class CollectionService 
{
	private CollectionDao collectionDao;
	private CollectionTagDao collectionTagDao;
	public void setCollectionDao(CollectionDao collectionDao) {
		this.collectionDao = collectionDao;
	}
	public void setCollectionTagDao(CollectionTagDao collectionTagDao) {
		this.collectionTagDao = collectionTagDao;
	}
	
	public void saveCollection(Collection collection)
	{
		collectionDao.save(collection);
	}
	
	public void removeCollection(String collectionid)
	{
		collectionDao.remove(collectionid);
	}
	
	public PagesBean<Collection> pageQuery(String userid,QueryInfo info)
	{
		QueryResult<Collection> result=collectionDao.pageQuery(userid, info.getStartindex(), info.getPagesize());
		PagesBean<Collection> bean=new PagesBean<Collection>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(result.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(result.getTotalrecord());
		return bean;
	}
	
	public PagesBean<Collection> pageQuery(String userid,String tagid,QueryInfo info)
	{
		QueryResult<Collection> result=collectionDao.pageQuery(userid, tagid,info.getStartindex(), info.getPagesize());
		PagesBean<Collection> bean=new PagesBean<Collection>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(result.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(result.getTotalrecord());
		return bean;
	}
	
	public void saveCollectionTag(CollectionTag collectionTag)
	{
		collectionTagDao.save(collectionTag);
	}
	
	public void delete(String collectionTagid)
	{
		collectionTagDao.delete(collectionTagid);
	}
	
	public List<CollectionTag> get(String userid)
	{
		return collectionTagDao.get(userid);
	}
}
