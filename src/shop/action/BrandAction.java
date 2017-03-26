package shop.action;

import org.apache.struts2.ServletActionContext;

import shop.entity.Brand;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.service.BrandService;

import com.opensymphony.xwork2.ActionSupport;

public class BrandAction extends ActionSupport {
	private BrandService brandService;
	private Brand brand;
	private PagesBean<Brand> pagesBean;
	private QueryInfo queryInfo;
	public QueryInfo getQueryInfo() {
		return queryInfo;
	}

	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

	public PagesBean<Brand> getPagesBean() {
		return pagesBean;
	}

	public void setPagesBean(PagesBean<Brand> pagesBean) {
		this.pagesBean = pagesBean;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	
	/**
	 * ת�������ӽ���
	 * @return
	 */
	public String toAddBrand()
	{
		if(brand!=null)
			ServletActionContext.getRequest().setAttribute("pid", brand.getBrandid());
		return "toAddBrand";
	}
	
	/**
	 * ���һ������
	 * @return
	 */
	public String addBrand()
	{
		if(brandService.add(brand))
			return "addSuccess";
		return "addERROR";
	}
	
	/**
	 * ��ҳ��ѯ
	 * @return
	 */
	public String pageQuery()
	{
		QueryInfo info=new QueryInfo();
		if(queryInfo!=null)
			info=queryInfo;
		PagesBean<Brand> bean=new PagesBean<Brand>();
		bean=brandService.pageQuery(info);
		ServletActionContext.getRequest().setAttribute("pagebean", bean);
		return "listPage";
	}
}
