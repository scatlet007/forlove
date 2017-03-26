package shop.entity;

/**
 * 图片
 * @author letmetria
 *
 */
public class Image {
		private String imageid;		//标识
		private String imagename;
		private String imgurl;		//存储地址
		private int width;		//宽度
		private int height;		//高度
		private String suffix;	//后缀
		
		public String getImageid() {
			return imageid;
		}
		public void setImageid(String imageid) {
			this.imageid = imageid;
		}
		public String getImagename() {
			return imagename;
		}
		public void setImagename(String imagename) {
			this.imagename = imagename;
		}
		public String getImgurl() {
			return imgurl;
		}
		public void setImgurl(String imgurl) {
			this.imgurl = imgurl;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getSuffix() {
			return suffix;
		}
		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}
}
