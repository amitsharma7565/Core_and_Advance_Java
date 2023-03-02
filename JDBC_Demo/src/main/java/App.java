import java.sql.*;
import com.DAO.DamoImpl;
public class App {
	public static void main (String args[]) throws SQLException {
		DamoImpl obj= new DamoImpl();
		obj.insert();
		obj.update();
		obj.delete();
		obj.display();





		

	}
}
