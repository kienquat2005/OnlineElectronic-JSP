package com.electronic.Model;

public class Product {
	private String ProductID;
	private String Name;
	private String Detail;
	private String Price;
	private String Images;
	private String PriceNew;
	private String Status;
	private String CategoryID;
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getImages() {
		return Images;
	}
	public void setImages(String images) {
		Images = images;
	}
	public String getPriceNew() {
		return PriceNew;
	}
	public void setPriceNew(String priceNew) {
		PriceNew = priceNew;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}
	public Product() {
		super();
	}
	public Product(String productID, String name, String detail, String price, String images, String priceNew, String status) {
		super();
		ProductID= productID;
		Name = name;
		Detail = detail;
		Price = price;
		Images = images;
		PriceNew = priceNew;
		Status = status;
	}
	public Product(String productID) {
		super();
		ProductID = productID;
	}
	public Product( String name, String detail, String price, String images, String priceNew, String status) {
		super();
		Name = name;
		Detail = detail;
		Price = price;
		Images = images;
		PriceNew = priceNew;
		Status = status;
	}
	
	
	
	
	

}
