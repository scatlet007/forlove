package shop.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import shop.entity.Brand;
import shop.entity.PagesBean;
import shop.entity.QueryInfo;
import shop.service.BrandService;

import com.opensymphony.xwork2.ActionSupport;

public class BrandAction extends ActionSupport {
	private BrandService brandService;
	private Brand brand;
	private Brand parent;
	private List<Brand> listParent;
	private List<Brand> listChild;
	private Map<String,Object> dataMap;
	private PagesBean<Brand> pagesBean;
	private QueryInfo queryInfo;
	
	public BrandAction()
	{
		dataMap=new HashMap<String, Object>();
		listParent=new ArrayList<Brand>();
		listChild=new ArrayList<Brand>();
	}
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
	
	public Brand getParent() {
		return parent;
	}

	public void setParent(Brand parent) {
		this.parent = parent;
	}
	
	public List<Brand> getListParent() {
		return listParent;
	}
	public void setListParent(List<Brand> listParent) {
		this.listParent = listParent;
	}
	public List<Brand> getListChild() {
		return listChild;
	}
	public void setListChild(List<Brand> listChild) {
		this.listChild = listChild;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	
	/**
	 * ת��һ��������ӽ���
	 * @return
	 */
	public String toAddBrand1()
	{
		return "toAddBrand1";
	}
	/**
	 * ת�����������ӽ���
	 * @return
	 */
	public String toAddBrand2()
	{
		brand=brandService.getById(brand.getParentid());
		return "toAddBrand2";
	}
	
	/**
	 * ת���޸Ľ���
	 * @return
	 */
	public String toUpdate()
	{
		brand=brandService.getById(this.brand.getBrandid());
		parent=brandService.getById(this.brand.getParentid());
		return "toUpdate";
	}
	/**
	 * ���һ������
	 * @return
	 */
	public String addBrand()
	{
		if(brandService.add(brand))
			return "json";
		return "addERROR";
	}
	
	/**
	 * �޸ķ�����Ϣ
	 * @return
	 */
	public String updateBrand()
	{
		brandService.update(brand);
		return "json";
	}
	
	public String delete()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		String brandid=request.getParameter("brandid");
		brandService.delete(brandid);
		return "json";
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
	
	public String getParents()
	{
		listParent=brandService.getParents();
		return "json";
	}
	
	public String getChild()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		String parentid=request.getParameter("parentid");
		listChild=brandService.getChild(parentid);
		return "json";
	}
}
