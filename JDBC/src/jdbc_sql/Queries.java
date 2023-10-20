package jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Mohini@2414");

		Statement smt = con.createStatement();

		String s = "INSERT INTO table1 VALUES (2, 8000)";

		smt.execute(s);

		con.close();

		System.out.println("Query executed");

	}

}
