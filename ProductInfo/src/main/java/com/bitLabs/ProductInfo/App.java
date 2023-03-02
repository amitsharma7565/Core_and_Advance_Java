package com.bitLabs.ProductInfo;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductInfo p= new ProductInfo();
    	Doa1 d= new DaoImpls1();
    	p.setPrice(600);
    	p.setProduct_name("Chai bottle");
    	d.insert(p);
    }
}
