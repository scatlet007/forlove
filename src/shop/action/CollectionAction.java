package shop.action;

import com.opensymphony.xwork2.ActionSupport;

import shop.service.CollectionService;

public class CollectionAction extends ActionSupport{
	private CollectionService collectionService;
	public void setCollectionService(CollectionService collectionService) {
		this.collectionService = collectionService;
	}
}
