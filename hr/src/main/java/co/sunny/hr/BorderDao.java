package co.sunny.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorderDao {
	private String driver = "oracle.jdbc.driver.OracleDriver"; 
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private String user = "sunny"; 
	private String password = "1234";
	
	private Connection conn; //연결객체
	private PreparedStatement psmt;
	private ResultSet rs;
	private BorderVO vo;
	
	private final String SELECT_ALL = "SELECT * FROM BORDER";
	private final String SELECT_SEARCH = "SELECT * FROM BORDER WHERE BORDERID = ?";
	private final String  INSERT_BORDER = 
			"INSERT INTO "  //into다음 띄어쓰기
			+ "BORDER(BORDERID, BORDERWRITER, BODERTITLE, BORDERCONTENT)"
			+ "VALUES(?,?,?,?)";		
			                         
	
	public BorderDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<BorderVO> select() {
		List<BorderVO> list = new ArrayList<BorderVO>();
		try {
			
			psmt = conn.prepareStatement(SELECT_ALL);   //()명령을 실행하는 객체
		    rs = psmt.executeQuery();  //쿼리를 한다
			while(rs.next()) {  //SELECT_ALL 돌아가면서 빼내온다. 얘만 기억하기
				vo = new BorderVO();
				vo.setBorderid(rs.getInt("borderid"));
				vo.setBorderwriter(rs.getString("borderwriter"));
				vo.setBodertitle(rs.getString("bodertitle"));
				vo.setBordercontent(rs.getString("bordercontent"));
				vo.setBorderdate(rs.getDate("borderdate"));
				vo.setBorderhit(rs.getInt("borderhit"));
				list.add(vo); //list에 담는다
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {  //객체를 닫음
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
//				if(conn != null) conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public BorderVO selectSearch(BorderVO vo) {
		try {
			psmt = conn.prepareStatement(SELECT_SEARCH);
			psmt.setInt(1, vo.getBorderid());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBorderid(rs.getInt("borderid"));
				vo.setBorderwriter(rs.getString("borderwriter"));
				vo.setBodertitle(rs.getString("bodertitle"));
				vo.setBordercontent(rs.getString("bordercontent"));
				vo.setBorderdate(rs.getDate("borderdate"));
				vo.setBorderhit(rs.getInt("borderhit"));
				
			}else { 
				vo = null;  //키값이 존재하지않을때
			}
					
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
    public int insert(BorderVO vo) {
    	int n = 0;
    	try {
    		psmt = conn.prepareStatement(INSERT_BORDER);
    		psmt.setInt(1, vo.getBorderid());
    		psmt.setString(2, vo.getBorderwriter());
    		psmt.setString(3, vo.getBodertitle());
    		psmt.setString(4, vo.getBordercontent());
    		n = psmt.executeUpdate();  //질의실행
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return n;
    }
    public int update(BorderVO vo) {
    	int n = 0;
    	
    	return n;
}
    public int delete(BorderVO vo) {
    	int n = 0;
    	
    	return n;
    }
}
