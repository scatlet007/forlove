package shop.dao.impl;

import shop.dao.BaseDao;
import shop.dao.CameraDao;
import shop.entity.Camera;

public class CameraDaoImpl implements CameraDao {
	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(Camera camera) {
		baseDao.add(camera);
	}

	@Override
	public Camera getInfo(String cameraid) {
		return baseDao.query(
				"select * from t_camera where camera_phone=" + cameraid,
				Camera.class).get(0);
	}

	@Override
	public void update(Camera camera) {
		baseDao.update(camera);
	}

	@Override
	public void delete(String cameraid) {
		baseDao.delete(Camera.class, cameraid);
	}

}
