package shop.dao;

import shop.entity.Screen;

public interface ScreenDao {
	
	public void save(Screen screen);
	
	public void delete(String id);
	
	public void update(Screen screen);
	
	public Screen get(String phoneid);
}
