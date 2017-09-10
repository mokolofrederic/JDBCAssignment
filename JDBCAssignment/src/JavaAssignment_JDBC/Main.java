package JavaAssignment_JDBC;

import java.sql.*;

public class Main {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USER = "sys as sysdba";
	static final String PASS = "password123";

	public static void main(String[] args) {
		Statement stmt = null;
		Connection conn = null;

		try {

			Class.forName(JDBC_DRIVER);
			String sql = "create table Employee ("
					+ "EmployeeNo Number(10) NOT NULL PRIMARY KEY, "
					+ "firstName VARCHAR(255), "
					+ "lastName VARCHAR(255),"
					+ "time_in VARCHAR(255), "
					+ "time_out VARCHAR(255)"
					+ ") ";

			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

			stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		InputCollector inp = new InputCollector();
		inp.collectInput();

	}

}