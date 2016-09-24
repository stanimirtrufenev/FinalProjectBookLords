package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_SCHEMA = "booklords";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";

	private static DBConnection instance;
	private Connection connection;

	private DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		this.connection = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_SCHEMA,
				DB_USERNAME, DB_PASSWORD);
	}

	public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
		if (DBConnection.instance == null) {
			DBConnection.instance = new DBConnection();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

}
