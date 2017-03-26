package shop.service;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BrandDao;
import shop.entity.Brand;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;


public class BrandService {
	private BrandDao brandDao;

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}
	
	public boolean add(Brand brand)
	{
		return brandDao.add(brand);
	}
	
	public List<Brand> getAll()
	{
		List<Brand> parent=brandDao.getAllParent();
		List<Brand> list=new ArrayList<Brand>();
		for(Brand b:parent)
		{
			List<Brand> listitem=new ArrayList<Brand>();
			listitem=brandDao.getChild(b.getBrandid());
			for(int i=0;i<listitem.size();i++)
				list.add(listitem.get(i));
		}
		return list;
	}
	public PagesBean<Brand> pageQuery(QueryInfo info)
	{
		QueryResult<Brand> qr=brandDao.getAll();
		
		PagesBean<Brand> bean=new PagesBean<Brand>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(qr.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(qr.getTotalrecord());
		return bean;
	}
}
