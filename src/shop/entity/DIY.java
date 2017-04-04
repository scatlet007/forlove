package shop.entity;

public class DIY {
	private String systemid;
	private String name;
	private int core;
	private String usertable;
	private String CPUType;
	private String CPUHz;
	private String GPUType;
	private int RAM;
	private int ROM;
	private int isextend;
	private int extend;
	private String phoneid;
	public String getSystemid() {
		return systemid;
	}
	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCore() {
		return core;
	}
	public void setCore(int core) {
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
	public int getIsextend() {
		return isextend;
	}
	public void setIsextend(int isextend) {
		this.isextend = isextend;
	}
	public int getExtend() {
		return extend;
	}
	public void setExtend(int extend) {
		this.extend = extend;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	
}
