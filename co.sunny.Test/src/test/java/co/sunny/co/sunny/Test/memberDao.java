package co.sunny.co.sunny.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class memberDao {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "sunny";
	private static String password = "1234";

	private static Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public MemberBean getData(String id) {
		String sql = "select name from Member where id = ? ";
		MemberBean bean = new MemberBean();
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		rs = psmt.executeQuery();
		if (rs.next())
			bean.name = rs.getString(name);
		return bean;

	}
}
