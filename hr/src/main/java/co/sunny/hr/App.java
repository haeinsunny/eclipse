package co.sunny.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//    	List<BorderVO> list = new ArrayList<BorderVO>();
    	BorderVO bv = new BorderVO();
    	BorderDao dao = new BorderDao();
    	bv.setBorderid(3);
    	bv = dao.selectSearch(bv);
    	if(bv != null) {
    	    bv.toString();
    	}else {
    		System.out.println("검색할 데이터가 없습니다.");
    	}
    	
//    	list = dao.select(); //select 질의 수행
    	
//    	for(BorderVO vo : list) {
//    		vo.toString();  //list 출력문
//    		
//    	}
//    	bv.setBorderid(4);
//    	bv.setBorderwriter("박승리");
//        bv.setBodertitle("재미있는 수업");
//        bv.setBordercontent("박승리 데이터를 입력합니다.");
//        
//        int n = dao.insert(bv);
//        if(n != 0) {
//        	list = dao.select();
//        	for(BorderVO vo : list) {
//        		vo.toString();
//        	}
//        }else {
//        	System.out.println("데이터 입력에 실패했습니다.");
//        }
        
//    	String driver = "oracle.jdbc.driver.OracleDriver"; 
//    	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
//    	String user = "hr"; 
//    	String password = "hr";
//    	Connection conn = null; //연결객체
//    	
//     try {
//    	 Class.forName(driver);
//    	 conn = DriverManager.getConnection(url, user, password);
//    	 System.out.println(conn);
//    	 System.out.println("연결성공");
//     }catch(ClassNotFoundException | SQLException e){
//    	 System.out.println("연결실패");
//     }
    }
}
