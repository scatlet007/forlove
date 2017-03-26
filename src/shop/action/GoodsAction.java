package shop.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import com.opensymphony.xwork2.ActionSupport;

import shop.entity.Brand;
import shop.entity.Image;
import shop.entity.Phone;
import shop.entity.PhoneDesc;
import shop.indexdomin.PhoneItem;
import shop.service.PhoneService;
import shop.utils.Common;

public class GoodsAction extends ActionSupport {
	private PhoneService phoneService;

	public void setPhoneService(PhoneService phoneService) {
		this.phoneService = phoneService;
	}
	
	/**
	 * 转向手机信息添加界面
	 * @return
	 */
	public String toAddCellphone()
	{
		List<Brand> been=new ArrayList<Brand>();
		been=phoneService.getBrand();
		List<Brand> child=phoneService.getChildBrand(been.get(0).getBrandid());
		ServletActionContext.getRequest().setAttribute("been", been);
		ServletActionContext.getRequest().setAttribute("child", child);
		return "addCellphone";
	}
	
	public String getChildBrand()
	{
		String id=ServletActionContext.getRequest().getParameter("pid");
		brandlist=phoneService.getChildBrand(id);
		ServletActionContext.getRequest().setAttribute("size", brandlist.size());
		return SUCCESS;
	}
	public String addPhone() throws Exception{
		String realpath=ServletActionContext.getServletContext().getRealPath("/imgs");
		File uploadfile=new File(realpath);
		if(!file.exists())
			file.mkdirs();
		System.out.println(fileFileName);
		String suffix="";
		suffix=fileFileName.substring(fileFileName.lastIndexOf("."));
		fileFileName=Common.getId("image")+suffix;
		FileUtils.copyFile(file, new File(uploadfile,fileFileName));
		Image image=new Image();
		String imageid=Common.getId("image");
		image.setImageid(imageid);
		image.setImagename(fileFileName);
		image.setImgurl(realpath+"/"+fileFileName);
		
		String phoneid=Common.getId("phone");
		phone.setPhoneid(phoneid);
		phoneService.addPhone(phone);
		phoneService.addImage(image);
		phoneService.bind(phoneid, imageid);
		return "addPhone";
	}
	
	public String getPhonesInfo()
	{
		plist=phoneService.getAll();
		return "getPhonesInfo";
	}
	
	public String toAddPhoneDesc()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		String phoneid=request.getParameter("phoneid");
		request.setAttribute("phoneid", phoneid);
		return "toAddPhoneDesc";
	}
	public String addPhoneDesc()
	{
		String str="";
		for(String item:g4)
		{
			str=str+"4G:"+item+"#";
		}
		for(String item:g3)
		{
			str=str+"3G:"+item+"#";
		}
		phoneDesc.setPhonedescid(Common.getId("phoneDesc"));
		phoneDesc.setInternet(str);
		System.out.println(phoneDesc.toString());
		phoneService.addPhoneDesc(phoneDesc);
		return "addPhoneDesc";
	}
	public GoodsAction()
	{
		brandlist=new ArrayList<Brand>();
		plist=new ArrayList<PhoneItem>();
	}
	
	private Phone phone;
	private PhoneDesc phoneDesc;
	public String[] g4;
	public String[] g3;
	private List<PhoneItem> plist;
	private List<Brand> brandlist;
	private File file;
	private String fileFileName;
	private String fileContentType;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public PhoneDesc getPhoneDesc() {
		return phoneDesc;
	}

	public void setPhoneDesc(PhoneDesc phoneDesc) {
		this.phoneDesc = phoneDesc;
	}

	public List<PhoneItem> getPlist() {
		return plist;
	}

	public void setPlist(List<PhoneItem> plist) {
		this.plist = plist;
	}

	public List<Brand> getBrandlist() {
		return brandlist;
	}

	public void setBrandlist(List<Brand> brandlist) {
		this.brandlist = brandlist;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	
}
