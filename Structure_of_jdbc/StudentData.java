package basic_str.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentData {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is installed");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			System.out.println("connection is done");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
