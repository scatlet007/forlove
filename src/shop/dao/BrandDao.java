package shop.dao;

import java.util.List;

import shop.entity.Brand;
import shop.entity.QueryResult;

public interface BrandDao {
	
	/**
	 * 添加一个分类
	 * @param brand
	 * @return
	 */
	public boolean add(Brand brand);
	
	public void delete(String brandid);
	
	public void update(Brand brand);
	
	public QueryResult<Brand> pageQuery(int startindex,int pagesize);
	
	public QueryResult<Brand> pageQuery(String parent,int startindex,int pagesize);
	
	public QueryResult<Brand> getAll();
	
	public List<Brand> getAllParent();
	
	public List<Brand> getChild(String parent);
	
	public Brand getBrand(String brandid);
}
