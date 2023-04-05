package JdbcLearn.GymPerson;

import java.sql.SQLException;

import com.jdbc.demo.DaoImpl;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String args[]) throws SQLException {
		DaoImpl d= new DaoImpl();
//		d.insert();
//		d.update();
//		d.delete();
		d.displayAll();
	}
}
