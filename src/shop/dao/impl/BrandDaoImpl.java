package shop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BaseDao;
import shop.dao.BrandDao;
import shop.entity.Brand;
import shop.entity.QueryResult;

public class BrandDaoImpl implements BrandDao {
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public boolean add(Brand brand) {
		try {
			if(brand.getParentid()==null)
				brand.setParentid(brand.getBrandid());
			baseDao.add(brand);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public QueryResult<Brand> pageQuery(int startindex, int pagesize) {
		QueryResult<Brand> queryResult = new QueryResult<Brand>();
		List<Brand> parent = baseDao.query(
				"select * from t_brand where brandid=parentid", Brand.class);
		List<Brand> list = new ArrayList<Brand>();
		for (Brand b : parent) {
			List<Brand> listitem = new ArrayList<Brand>();
			list.add(b);
			listitem = baseDao.query(
					"select * from t_brand where parentid=? and parentid!=brandid",
					new Object[] { b.getBrandid() }, Brand.class);
			for (int i = 0; i < listitem.size(); i++)
				list.add(listitem.get(i));
		}
		//¿ªÊ¼·ÖÒ³
		List<Brand> result = new ArrayList<Brand>();
		//lise.size()<pagesize
		if(list.size()<=pagesize)
		{
			result.addAll(list);
		}else if(list.size()-startindex<pagesize)
		{//list.size()-startindex<pagesize
			for (int i = startindex; i <list.size(); i++)
				result.add(list.get(i));
		}else
		{//list.size()-startindex>=pagesize
			for (int i = startindex; i <startindex+pagesize; i++)
				result.add(list.get(i));
		}
		queryResult.setList(result);
		queryResult.setTotalrecord(list.size());
		return queryResult;
	}

	@Override
	public QueryResult<Brand> getAll() {
		QueryResult<Brand> queryResult = new QueryResult<Brand>();
		List<Brand> parent = baseDao.query(
				"select * from t_brand where brandid=parentid", Brand.class);
		List<Brand> list = new ArrayList<Brand>();
		for (Brand b : parent) {
			List<Brand> listitem = new ArrayList<Brand>();
			list.add(b);
			listitem = baseDao.query(
					"select * from t_brand where parentid=? and parentid!=brandid",
					new Object[] { b.getBrandid() }, Brand.class);
			for (int i = 0; i < listitem.size(); i++)
				list.add(listitem.get(i));
		}

		queryResult.setList(list);
		queryResult.setTotalrecord(list.size());
		return queryResult;
	}

	@Override
	public List<Brand> getAllParent() {
		return baseDao.query("select * from t_brand where brandid=parentid",
				Brand.class);
	}

	@Override
	public List<Brand> getChild(String parent) {
		return baseDao.query(
				"select * from t_brand where parentid=? and brandid!=parentid",
				new Object[] { parent }, Brand.class);
	}

	@Override
	public Brand getBrand(String brandid) {
		return baseDao.getByHibernate(Brand.class, brandid);
	}

	@Override
	public void delete(String brandid) {
		baseDao.delete(Brand.class, brandid);
	}

	@Override
	public void update(Brand brand) {
		baseDao.update(brand);

	}
	
	@Override
	public QueryResult<Brand> pageQuery(String parentid, int startindex,
			int pagesize) {
		QueryResult<Brand> queryResult = new QueryResult<Brand>();
		Brand parent=baseDao.getByHibernate(Brand.class, parentid);
		List<Brand> list = new ArrayList<Brand>();
		list.add(parent);
		List<Brand> listitem = new ArrayList<Brand>();
		listitem = baseDao.query(
				"select * from t_brand where parentid=? and parentid!=brandid litmit ?,?",
				new Object[] {parentid,startindex,pagesize }, Brand.class);
		for (int i = 0; i < listitem.size(); i++)
			list.add(listitem.get(i));
		queryResult.setList(list);
		queryResult.setTotalrecord(list.size());
		return queryResult;
	}

}
