package shop.service;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BrandDao;
import shop.dao.ImageDao;
import shop.dao.ImgsDao;
import shop.dao.PhoneDao;
import shop.dao.PhoneDescDao;
import shop.entity.Brand;
import shop.entity.Image;
import shop.entity.Imgs;
import shop.entity.Phone;
import shop.entity.PhoneDesc;
import shop.indexdomin.PhoneItem;

public class PhoneService {
	private PhoneDao phoneDao;
	private BrandDao brandDao;
	private ImageDao imageDao;
	private ImgsDao imgsDao;
	private PhoneDescDao phoneDescDao;

	
	public void setPhoneDescDao(PhoneDescDao phoneDescDao) {
		this.phoneDescDao = phoneDescDao;
	}

	public List<Brand> getBrand()
	{
		return brandDao.getAllParent();
	}
	
	public List<Brand> getChildBrand(String parent)
	{
		return brandDao.getChild(parent);
	}
	
	public void bind(String phoneid, String imageid) 
	{
		imgsDao.bind(phoneid, imageid);
	}
	
	public List<PhoneItem> getAll()
	{
		List<Phone> phones=phoneDao.getAll();
		List<PhoneItem> plist=new ArrayList<PhoneItem>();
		for(Phone item:phones)
		{
			PhoneItem pitem=new PhoneItem();
			pitem.setPhoneid(item.getPhoneid());
			pitem.setPhonename(item.getPhonename());
			pitem.setPrice(item.getPrice());
			pitem.setTitle(item.getTitle());
			
			Brand brand=brandDao.getBrand(item.getBrandid());
			pitem.setBrandname(brand.getBrandname());
			Imgs imgs=imgsDao.getImgs(item.getPhoneid());
			Image image=imageDao.getImage(imgs.getImageid());
			pitem.setImgname(image.getImagename());
			
			plist.add(pitem);
		}
		
		return plist;
	}
	
	public void addPhone(Phone p){
		phoneDao.add(p);
	}
	
	public void addImage(Image image){
		imageDao.add(image);
	}
	public void addPhoneDesc(PhoneDesc phoneDesc)
	{
		phoneDescDao.add(phoneDesc);
	}
	public PhoneDesc getPhoneDesc(String phoneid)
	{
		return phoneDescDao.get(phoneid);
	}
	
	
	public void setPhoneDao(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	public void setImageDao(ImageDao imageDao) {
		this.imageDao = imageDao;
	}

	public void setImgsDao(ImgsDao imgsDao) {
		this.imgsDao = imgsDao;
	}

	
}
