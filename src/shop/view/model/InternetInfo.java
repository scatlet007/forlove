package shop.view.model;

import java.util.List;

import shop.entity.Internet;
import shop.entity.NetItem;

public class InternetInfo extends Internet{
	private List<NetItem> items;

	public List<NetItem> getItems() {
		return items;
	}

	public void setItems(List<NetItem> items) {
		this.items = items;
	} 
	
}
