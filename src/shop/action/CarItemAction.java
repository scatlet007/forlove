package shop.action;

import com.opensymphony.xwork2.ActionSupport;

import shop.service.CarItemService;

public class CarItemAction extends ActionSupport{
	private CarItemService carItemService;

	public void setCarItemService(CarItemService carItemService) {
		this.carItemService = carItemService;
	}
}
