package shop.entity;

/**
 * ����
 * @author letmetria
 *
 */
public class Admin {
		private String adminid;			//��ʶ
		private String adminname;		//������
		private String password;		//����
		
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
