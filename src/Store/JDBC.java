package Store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Andreas
 *
 */
public class JDBC {

	private static String username = "root"; // username för mysql
	private static String password = "mySQL_Password123"; // lösen till samma användare
	private static String dbConnection = "jdbc:mysql://127.0.0.1:3306/sakila";

	
	static Connection conn = null;
	static Statement stmt = null;

	
	static void init() throws SQLException {
		if(conn == null) {
			conn = DriverManager.getConnection(dbConnection, username, password);	
		}
		if(stmt == null) {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);	
		}
	}


	public static Statement getStmt() throws SQLException {
		init();
		return stmt;
	}
	public static void setStmt(Statement stmt) {
		JDBC.stmt = stmt;
	}
	
	
	
}
