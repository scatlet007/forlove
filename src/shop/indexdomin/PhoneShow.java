package shop.indexdomin;

/**
 * 前台显示用，商品详细信息
 * @author letmetria
 *
 */
public class PhoneShow {
	private String phoneid; // 标识
	private String phonename; // 商品名
	private String title; // 显示标题
	private float price; // 价格
	private String brandname; // 分类名
	private String imgname; // 图片名，用于显示

	// 屏幕
	private String screenType; // 屏幕类型
	private String resolution; // 分辨率
	private String screensize; // 屏幕尺寸
	private String PPI; // 像素密度
	private String texture; // 材质
	private String color; // 屏幕色彩

	// 网络
	private String internet; // 网络，key:value 用'#'分割0
	private String SIM; // SIM卡种类
	private String GPS; // GPS
	private String lshare; // 连接与共享0

	// 硬件
	private String systems; // 系统
	private String core; // 核心数
	private String usertable; // 用户界面
	private String CPUType; // CPU类型
	private String CPUHz; // CPU频率
	private String GPUType; // GPU类型
	private int RAM; // RAM容量
	private int ROM; // ROM容量
	private String kuozhan; // 扩展容量

	// 摄像头
	private String camera; // 摄像头类型
	private String pre; // 前置摄像头；
	private String tlast; // 后置摄像头
	
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonename() {
		return phonename;
	}
	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
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
	
}
