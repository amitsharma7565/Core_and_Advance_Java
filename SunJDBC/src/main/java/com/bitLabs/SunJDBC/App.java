package com.bitLabs.SunJDBC;

import java.sql.SQLException;

import com.DAO.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	DaoImpl dm= new DaoImpl();
//    	dm.insert();
//    	dm.update();
//    	dm.delete();
    	dm.displayAll();
    }
}
