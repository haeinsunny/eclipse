package co.sunny.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbTest {
	public static void main(String[]args) {
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "hr"; 
		String password = "hr";
		Connection conn; //연결객체


		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("성공");
			
		} catch(Exception e) {
			System.out.println("DB연결 실패!!!");
		}
	}

}
