package shop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import shop.dao.BaseDao;
import shop.dao.PhoneDao;
import shop.entity.Image;
import shop.entity.Phone;
import shop.entity.QueryResult;
import shop.view.model.PhoneListItem;
import shop.view.model.PhoneTag;

public class PhoneDaoImpl implements PhoneDao{
	
	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(Phone p) {
		baseDao.add(p);
	}

	@Override
	public List<Phone> getAll() {
		return baseDao.query("select * from t_phone", Phone.class);
	}

	@Override
	public List<PhoneTag> getRecommend() {
		String sql = "select phoneid,title,price,imgurl from t_phone,t_image where phoneid=image_phoneid and phoneid in(select collection_phone from t_collection,collectionTag where collectionid=colection_collectionTag and tagname='Õ∆ºˆ')";
		List<PhoneTag> list = baseDao.query(sql, PhoneTag.class);
		return list;
	}

	@Override
	public List<PhoneTag> getHostPhone() {
		String sql = "select phoneid,title,price,imgurl from t_phone,t_image where phoneid=image_phoneid and phoneid in(select collection_phone from t_collection,collectionTag where collectionid=colection_collectionTag and tagname='»»√≈')";
		List<PhoneTag> list = baseDao.query(sql, PhoneTag.class);
		return list;
	}

	@Override
	public QueryResult<PhoneTag> search(String s, int startindex, int pagesize) 
	{
		QueryResult<PhoneTag> queryResult = new QueryResult<PhoneTag>();
		queryResult
				.setList(baseDao
						.query("select phoneid,title,price,imgurl from t_phone,t_image where image_phone=phoneid and"
								+ " title like %?% limit ?,?", new Object[] {
								s, startindex, pagesize }, PhoneTag.class));
		queryResult
				.setTotalrecord(baseDao
						.query("select phoneid,title,price,imgurl from t_phone,t_image where image_phone=phoneid and"
								+ " title like %?%", new Object[] { s },
								PhoneTag.class).size());
		return queryResult;
	}

	@Override
	public QueryResult<PhoneTag> find(String sql, int startindex, int pagesize) {
		QueryResult<PhoneTag> queryResult = new QueryResult<PhoneTag>();
		queryResult
				.setList(baseDao
						.query("select phoneid,title,price,imgurl from t_phone,t_image where image_phone=phoneid and"
								+ sql + " limit ?,?", new Object[] {
								startindex, pagesize }, PhoneTag.class));
		queryResult
				.setTotalrecord(baseDao
						.query("select phoneid,title,price,imgurl from t_phone,t_image where image_phone=phoneid and"
								+ sql, PhoneTag.class).size());
		return queryResult;
	}

	@Override
	public Phone getPhoneInfo(String phoneid) {
		return baseDao.getByHibernate(Phone.class, phoneid);
	}

	@Override
	public QueryResult<PhoneListItem> getPhoneList(int startindex, int pagesize) 
	{
		QueryResult<PhoneListItem> queryResult = new QueryResult<PhoneListItem>();
		List<PhoneListItem> list=new ArrayList<PhoneListItem>(); 
		List<Phone> phones=baseDao.query("select * from t_phone limit ?,?", new Object[]{startindex,pagesize},Phone.class);
		int size=baseDao.query("select * from t_phone", Phone.class).size();
		for(Phone item:phones)
		{
			PhoneListItem phoneItem=new PhoneListItem();
			phoneItem.setPhoneid(item.getPhoneid());
			phoneItem.setTitle(item.getTitle());
			phoneItem.setPrice(item.getPrice());
			List<Image> images=baseDao.query("select * from t_image where phoneid=?", new Object[]{item.getPhoneid()}, Image.class);
			if(images.size()>0)
				phoneItem.setIcon(images.get(0).getImgurl());
			list.add(phoneItem);
		}
		queryResult.setList(list);
		queryResult.setTotalrecord(size);
		return queryResult;
	}

}
