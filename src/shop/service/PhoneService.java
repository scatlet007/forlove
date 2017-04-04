package shop.service;

import java.util.List;

import shop.dao.CameraDao;
import shop.dao.DIYDao;
import shop.dao.InternetDao;
import shop.dao.NetItemDao;
import shop.dao.PhoneDao;
import shop.dao.ScreenDao;
import shop.dao.SupportDao;
import shop.entity.Camera;
import shop.entity.DIY;
import shop.entity.Internet;
import shop.entity.NetItem;
import shop.entity.PagesBean;
import shop.entity.Phone;
import shop.entity.QueryInfo;
import shop.entity.QueryResult;
import shop.entity.Screen;
import shop.entity.Support;
import shop.utils.Common;
import shop.view.model.InternetInfo;
import shop.view.model.PhoneListItem;
import shop.view.model.PhoneTag;

public class PhoneService {
	private CameraDao cameraDao;
	private DIYDao diyDao;
	private InternetDao internetDao;
	private NetItemDao netItemDao;
	private PhoneDao phoneDao;
	private ScreenDao screenDao;
	private SupportDao supportDao;
	public void setCameraDao(CameraDao cameraDao) {
		this.cameraDao = cameraDao;
	}
	public void setDiyDao(DIYDao diyDao) {
		this.diyDao = diyDao;
	}
	public void setInternetDao(InternetDao internetDao) {
		this.internetDao = internetDao;
	}
	public void setNetItemDao(NetItemDao netItemDao) {
		this.netItemDao = netItemDao;
	}
	public void setPhoneDao(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}
	public void setScreenDao(ScreenDao screenDao) {
		this.screenDao = screenDao;
	}
	public void setSupportDao(SupportDao supportDao) {
		this.supportDao = supportDao;
	}
	
	public void save(Phone phone)
	{
		phone.setPhoneid(Common.getId("P"));
		phoneDao.add(phone);
	}
	//1.首页，推荐
	public List<PhoneTag> getRecommend()
	{
		return phoneDao.getRecommend();
	}
	//2.热门新机
	public List<PhoneTag> getHostPhone()
	{
		return phoneDao.getHostPhone();
	}
	//3.模糊查询手机 
	public PagesBean<PhoneTag> search(String s,QueryInfo info)
	{
		QueryResult<PhoneTag> result=phoneDao.search(s, info.getStartindex(), info.getPagesize());
		PagesBean<PhoneTag> bean=new PagesBean<PhoneTag>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(result.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(result.getTotalrecord());
		return bean;
	}
	
	public PagesBean<PhoneTag> find(String sql,QueryInfo info)
	{
		QueryResult<PhoneTag> result=phoneDao.find(sql, info.getStartindex(), info.getPagesize());
		PagesBean<PhoneTag> bean=new PagesBean<PhoneTag>();
		bean.setCurrentpage(info.getCurrentpage());
		bean.setList(result.getList());
		bean.setPagesize(info.getPagesize());
		bean.setTotalrecord(result.getTotalrecord());
		return bean;
	}
	//4.查出单个手机的基础信息
	public Phone getPhoneInfo(String phoneid)
	{
		return phoneDao.getPhoneInfo(phoneid);
	}
	//6.手机的详细信息，网路，相机，硬件，屏幕，服务支持
	public InternetInfo getInterInfo(String phoneid)
	{
		InternetInfo info =new InternetInfo();
		Internet internet =internetDao.getByPhoneid(phoneid);
		info.setGPS(internet.getGPS());
		info.setInternetid(internet.getInternetid());
		info.setPhoneid(phoneid);
		info.setShare(internet.getShare());
		info.setSIM(internet.getSIM());
		info.setWLAN(internet.getWLAN());
		info.setItems(netItemDao.get(phoneid));
		return info;
	}
	//列出手机基础信息---管理员用
	public PagesBean<PhoneListItem> getPhoneList(QueryInfo info)
	{
		System.out.println("start-->"+info.getStartindex());
		System.out.println("size-->"+info.getPagesize());
		QueryResult<PhoneListItem> result=new QueryResult<PhoneListItem>();
		result=phoneDao.getPhoneList(info.getStartindex(), info.getPagesize());
		PagesBean<PhoneListItem> bean=new PagesBean<PhoneListItem>();
		bean.setList(result.getList());
		bean.setTotalrecord(result.getTotalrecord());
		bean.setPagesize(info.getPagesize());
		bean.setCurrentpage(info.getCurrentpage());
		return bean;
	}
	public Camera getCamera(String phoneid)
	{
		return cameraDao.getInfo(phoneid);
	}
	
	public DIY getDIY(String phoneid)
	{
		return diyDao.get(phoneid);
	}
	
	public Screen getScreen(String phoneid)
	{
		return screenDao.get(phoneid);
	}
	
	public Support getSupport(String phoneid)
	{
		return supportDao.get(phoneid);
	}
	
	//
	public void saveInternet(Internet internet)
	{
		internetDao.save(internet);
	}
	
	public void deleteInternet(String internetid)
	{
		internetDao.delete(internetid);
	}
	
	public void updateInternet(Internet internet)
	{
		internetDao.update(internet);
	}
	
	public Internet getInternetById(String internetid)
	{
		return internetDao.get(internetid);
	}
	
	//
	public void saveNetItem(NetItem item)
	{
		netItemDao.save(item);
	}
	
	public void removeNetItem(String itemid)
	{
		netItemDao.remove(itemid);
	}
	
	public void updateNetItem(NetItem item)
	{
		netItemDao.update(item);
	}
	
	//
	public void saveCamera(Camera camera)
	{
		cameraDao.save(camera);
	}
	
	public void updateCamera(Camera camera)
	{
		cameraDao.update(camera);
	}
	
	public void deleteCamera(String cameraid)
	{
		cameraDao.delete(cameraid);
	}
	//
	public void saveDIY(DIY diy)
	{
		diyDao.save(diy);
	}
	
	public void deleteDIY(String id)
	{
		diyDao.delete(id);
	}
	
	public void updateDIY(DIY diy)
	{
		diyDao.update(diy);
	}
	//
	public void saveScreen(Screen screen)
	{
		screenDao.save(screen);
	}
	
	public void deleteScreen(String id)
	{
		screenDao.delete(id);
	}
	
	public void updateScreen(Screen screen)
	{
		screenDao.update(screen);
	}
	//
	public void saveSupport(Support support)
	{
		supportDao.save(support);
	}
	
	public void deleteSupport(String id)
	{
		supportDao.delete(id);
	}
	
	public void updateSupport(Support support)
	{
		supportDao.update(support);
	}
}
