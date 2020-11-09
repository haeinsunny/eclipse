package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	public void connect() { // DB정보 (DbTest클래스 참조)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 예외처리 (이 클래스를 찾지못하면
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public void disconnect() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
