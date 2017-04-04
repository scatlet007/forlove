package shop.service;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BrandDao;
import shop.entity.Brand;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;
import shop.utils.Common;


public class BrandService {
	private BrandDao brandDao;

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}
	
	public boolean add(Brand brand)
	{
		return brandDao.add(brand);
	}
	
	public void update(Brand brand)
	{
		brandDao.update(brand);
	}
	
	public Brand getById(String brandid)
	{
		return brandDao.getBrand(brandid);
	}
	
	public void delete(String brandid)
	{
		brandDao.delete(brandid);
	}
	
	public void delete(String[] brandids)
	{
		for(String brandid:brandids)
			brandDao.delete(brandid);
	}
	
	public List<Brand> getAll()
	{
		List<Brand> parent=brandDao.getAllParent();
		List<Brand> list=new ArrayList<Brand>();
		for(Brand b:parent)
		{
			List<Brand> listitem=new ArrayList<Brand>();
			listitem=brandDao.getChild(b.getBrandid());
			list.addAll(listitem);
		}
		return list;
	}
	
	public PagesBean<Brand> pageQuery(QueryInfo info)
	{
		QueryResult<Brand> qr=brandDao.pageQuery(info.getStartindex(), info.getPagesize());
		PagesBean<Brand> bean=new PagesBean<Brand>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(qr.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(qr.getTotalrecord());
		return bean;
	}
	
	public PagesBean<Brand> pageQuery(String parent,QueryInfo info)
	{
		QueryResult<Brand> qr=brandDao.pageQuery(parent,info.getStartindex(), info.getPagesize());
		PagesBean<Brand> bean=new PagesBean<Brand>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(qr.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(qr.getTotalrecord());
		return bean;
	}
	
	public List<Brand> getParents()
	{
		return brandDao.getAllParent();
	}
	
	public List<Brand> getChild(String parentid)
	{
		return brandDao.getChild(parentid);
	}
}
