package shop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BaseDao;
import shop.dao.BrandDao;
import shop.entity.Brand;
import shop.entity.QueryResult;

public class BrandDaoImpl implements BrandDao{
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public boolean add(Brand brand) {
		try
		{
			baseDao.add(brand);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public QueryResult<Brand> pageQuery(int startindex, int pagesize) {
		QueryResult<Brand> queryResult=new QueryResult<Brand>();
		queryResult.setList(baseDao.query("select * from t_brand limit ?,?", new Object[]{startindex,pagesize}, Brand.class));
		queryResult.setTotalrecord(baseDao.query("select * from t_brand", Brand.class).size());
		return queryResult;
	}

	@Override
	public QueryResult<Brand> getAll() {
		QueryResult<Brand> queryResult=new QueryResult<Brand>();
		List<Brand> parent=baseDao.query("select * from t_brand where brandid=pid", Brand.class);;
		List<Brand> list=new ArrayList<Brand>();
		for(Brand b:parent)
		{
			List<Brand> listitem=new ArrayList<Brand>();
			list.add(b);
			listitem=baseDao.query("select * from t_brand where pid=? and pid!=brandid", new Object[]{b.getBrandid()}, Brand.class);
			for(int i=0;i<listitem.size();i++)
				list.add(listitem.get(i));
		}
		
		queryResult.setList(list);
		queryResult.setTotalrecord(list.size());
		return queryResult;
	}

	@Override
	public List<Brand> getAllParent() {
		return baseDao.query("select * from t_brand where brandid=pid", Brand.class);
	}

	@Override
	public List<Brand> getChild(String parent) {
		return baseDao.query("select * from t_brand where pid=? and brandid!=pid", new Object[]{parent}, Brand.class);
	}

	@Override
	public Brand getBrand(String brandid) {
		return baseDao.getByHibernate(Brand.class, brandid);
	}
	
}
