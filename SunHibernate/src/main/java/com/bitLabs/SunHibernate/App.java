package com.bitLabs.SunHibernate;

import Dao.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DaoImpl di= new DaoImpl();
//        di.insert();
//        di.getAllProduct();
//        di.updateById(101);
//        di.getProductById(101);
        di.deleteProductById(101);
    }
}
