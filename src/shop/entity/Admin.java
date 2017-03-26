package shop.entity;

/**
 * 管理
 * @author letmetria
 *
 */
public class Admin {
		private String adminid;			//标识
		private String adminname;		//管理名
		private String password;		//描述
		
		public String getAdminid() {
			return adminid;
		}
		public void setAdminid(String adminid) {
			this.adminid = adminid;
		}
		public String getAdminname() {
			return adminname;
		}
		public void setAdminname(String adminname) {
			this.adminname = adminname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
