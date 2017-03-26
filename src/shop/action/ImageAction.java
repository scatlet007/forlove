package shop.action;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import shop.service.ImageService;

import com.opensymphony.xwork2.ActionSupport;

public class ImageAction extends ActionSupport {
	
	private ImageService imageService;
	
	private File file;
	private String fileFileName;
	private String fileContentType;


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

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void setImageService(ImageService imageService) {
		this.imageService = imageService;
	}

	public String upload() throws Exception
	{
		System.out.println("filename->"+fileFileName);
		System.out.println("filename->"+fileContentType);
		String realpath=ServletActionContext.getServletContext().getRealPath("/imgs");
		File uploadfile=new File(realpath);
		if(!file.exists())
			file.mkdirs();
		FileUtils.copyFile(file, new File(uploadfile,fileFileName));
		return "success";
	}
}
