package shop.entity;

public class PhoneDesc {
		
		private String phonedescid;	//��ʶ
		//��Ļ
		private String screenType;	//��Ļ����
		private String resolution;	//�ֱ���
		private String screensize;	//��Ļ�ߴ�
		private String PPI;			//�����ܶ�
		private	String texture;		//����
		private String color;		//��Ļɫ��
		
		//����
		private String internet;	//���磬key:value ��'#'�ָ�0
		private String SIM;			//SIM������
		private String GPS;			//GPS
		private String lshare;		//�����빲��0
		
		//Ӳ��
		private String systems;		//ϵͳ
		private String core;		//������
		private String usertable;	//�û�����
		private String CPUType;		//CPU����
		private String CPUHz;		//CPUƵ��
		private	String GPUType;		//GPU����
		private int RAM;			//RAM����
		private int ROM;			//ROM����
		private String kuozhan;		//��չ����
		
		//����ͷ
		private String camera;		//����ͷ����
		private	String pre;			//ǰ������ͷ��
		private String tlast;		//��������ͷ
		private String phoneid;
		
		public String getPhonedescid() {
			return phonedescid;
		}
		public void setPhonedescid(String phonedescid) {
			this.phonedescid = phonedescid;
		}
		public String getScreenType() {
			return screenType;
		}
		public void setScreenType(String screenType) {
			this.screenType = screenType;
		}
		@Override
		public String toString() {
			return "PhoneDesc [phonedescid=" + phonedescid + ", screenType="
					+ screenType + ", resolution=" + resolution
					+ ", screensize=" + screensize + ", PPI=" + PPI
					+ ", texture=" + texture + ", color=" + color
					+ ", internet=" + internet + ", SIM=" + SIM + ", GPS="
					+ GPS + ", lshare=" + lshare + ", systems=" + systems
					+ ", core=" + core + ", usertable=" + usertable
					+ ", CPUType=" + CPUType + ", CPUHz=" + CPUHz
					+ ", GPUType=" + GPUType + ", RAM=" + RAM + ", ROM=" + ROM
					+ ", kuozhan=" + kuozhan + ", camera=" + camera + ", pre="
					+ pre + ", tlast=" + tlast + ", phoneid=" + phoneid + "]";
		}
		public String getResolution() {
			return resolution;
		}
		public void setResolution(String resolution) {
			this.resolution = resolution;
		}
		public String getScreensize() {
			return screensize;
		}
		public void setScreensize(String screensize) {
			this.screensize = screensize;
		}
		public String getPPI() {
			return PPI;
		}
		public void setPPI(String pPI) {
			PPI = pPI;
		}
		public String getTexture() {
			return texture;
		}
		public void setTexture(String texture) {
			this.texture = texture;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getInternet() {
			return internet;
		}
		public void setInternet(String internet) {
			this.internet = internet;
		}
		public String getSIM() {
			return SIM;
		}
		public void setSIM(String sIM) {
			SIM = sIM;
		}
		public String getGPS() {
			return GPS;
		}
		public void setGPS(String gPS) {
			GPS = gPS;
		}
		public String getLshare() {
			return lshare;
		}
		public void setLshare(String lshare) {
			this.lshare = lshare;
		}
		public String getSystems() {
			return systems;
		}
		public void setSystems(String systems) {
			this.systems = systems;
		}
		public String getCore() {
			return core;
		}
		public void setCore(String core) {
			this.core = core;
		}
		public String getUsertable() {
			return usertable;
		}
		public void setUsertable(String usertable) {
			this.usertable = usertable;
		}
		public String getCPUType() {
			return CPUType;
		}
		public void setCPUType(String cPUType) {
			CPUType = cPUType;
		}
		public String getCPUHz() {
			return CPUHz;
		}
		public void setCPUHz(String cPUHz) {
			CPUHz = cPUHz;
		}
		public String getGPUType() {
			return GPUType;
		}
		public void setGPUType(String gPUType) {
			GPUType = gPUType;
		}
		public int getRAM() {
			return RAM;
		}
		public void setRAM(int rAM) {
			RAM = rAM;
		}
		public int getROM() {
			return ROM;
		}
		public void setROM(int rOM) {
			ROM = rOM;
		}
		public String getKuozhan() {
			return kuozhan;
		}
		public void setKuozhan(String kuozhan) {
			this.kuozhan = kuozhan;
		}
		public String getCamera() {
			return camera;
		}
		public void setCamera(String camera) {
			this.camera = camera;
		}
		public String getPre() {
			return pre;
		}
		public void setPre(String pre) {
			this.pre = pre;
		}
		public String getTlast() {
			return tlast;
		}
		public void setTlast(String tlast) {
			this.tlast = tlast;
		}
		public String getPhoneid() {
			return phoneid;
		}
		public void setPhoneid(String phoneid) {
			this.phoneid = phoneid;
		}
		
}
