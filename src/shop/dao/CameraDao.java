package shop.dao;

import shop.entity.Camera;

public interface CameraDao {
	
	public void save(Camera camera);
	
	public Camera getInfo(String cameraid);
	
	public void update(Camera camera);
	
	public void delete(String cameraid);
}
