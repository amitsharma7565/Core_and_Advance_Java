package com.Product.CarDetailsCRUD;

import com.car.Dao.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DaoImpl d= new DaoImpl();
//        d.insert();
        d.getAllCars();
//        d.updateById(5);
//        d.getCarById(5);
//        d.deleteById(5);
    }
}
