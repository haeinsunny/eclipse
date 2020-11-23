package co.sunny.abstractDao.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.sunny.abstractDao.dao.vo.BorderVO;

public class BorderDao extends DAO {
  private PreparedStatement psmt; //값을 보내는 선언
  private ResultSet rs;  //sql insert 값 등을 넣기위해 선언
  private BorderVO vo;
  private Connection conn = DAO.getConnection();// DAO에서 공유작업 받기
  
  private final String SELECT_ALL = "SELECT * FROM BORDER";
  
  public List<BorderVO> selectALL(){  //바깥에서는 selectALL만 보임(정보은닉)
   List<BorderVO> list = new ArrayList<BorderVO>();
   try {
		
		psmt = conn.prepareStatement(SELECT_ALL);   //()명령을 실행하는 객체
	    rs = psmt.executeQuery();  //쿼리를 한다
		while(rs.next()) {  //SELECT_ALL 돌아가면서 빼내온다. 얘만 기억하기
//			getMapper(rs);
			list.add(getMapper(rs)); //받아온 vo객체값을 list에 담는다. 정보은폐(캡슐화)
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {  //객체를 닫음
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
//			if(conn != null) conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
  return list;
  }
  
  private void close() {
	  try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
//			if(conn != null) conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		} 
  }
  
  private BorderVO getMapper(ResultSet rs) throws SQLException {
	    vo = new BorderVO();  //vo객체
	    
		vo.setBorderid(rs.getInt("borderid"));
		vo.setBorderwriter(rs.getString("borderwriter"));
		vo.setBodertitle(rs.getString("bodertitle"));
		vo.setBordercontent(rs.getString("bordercontent"));
		vo.setBorderdate(rs.getDate("borderdate"));
		vo.setBorderhit(rs.getInt("borderhit"));
	  
	  return vo;
  }
  
}
