package com.Dao;

public interface ProductDao {
	
	public void insert();
	public void getAllProduct();
	public void updateById(int id);
	public void getProductById(int id);
	public void deleteProductById(int id);
	
}
