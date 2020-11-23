package co.sunny.abstractDao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
       
	private static String driver = "oracle.jdbc.driver.OracleDriver"; 
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private static String user = "sunny"; 
	private static String password = "1234";
	
	private static Connection conn;

	//생성자를 통한 상속	
	
//	public DAO() {
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, user, password);
//		}catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static Connection getConnection() {  //커넥션할 수있는것은public하기. private하면 stack영역에 올라가더라도 공유 안됨.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
