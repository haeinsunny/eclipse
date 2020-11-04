package cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DBCon;
import com.yedam.hi.Employee;

public class ProductDAO {
	Connection conn; // 자바.sql에 있는 구문들
	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	public Product getProdInfo(String itemNo) {
		conn = DBCon.getCon();
		Product prod = new Product();
		try {
			psmt = conn.prepareStatement("select * from product where item_no=?");
			psmt.setString(1, itemNo);
			rs = psmt.executeQuery();
			if (rs.next()) {
				prod.setItemNo(rs.getString("item_no"));  //get()괄호 안은 sql문이라서 대소구분x
				prod.setItemName(rs.getString("item_name"));
				prod.setPrice(rs.getInt("price"));
				prod.setItemDesc(rs.getString("item_desc"));
				prod.setLikeIt(rs.getDouble("like_it"));
				prod.setCategory(rs.getString("category"));
				prod.setItemImg(rs.getString("item_img"));
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally { // finally구문으로 DB연결 예외처리 해줘야함 (연결안되면 서비스 들어가서 오라클XE 재시작 해야함)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return prod;

	}

	
	
	public void insertProduct(Product prod) {  //저장함과 동시에 webpage와 DB에 들어가야함
		conn = DBCon.getCon();
		String sql = "insert into product values(?, ?, ?, ?, ?, ?, ?)";  
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, prod.getItemNo());
			psmt.setString(2, prod.getItemName());
			psmt.setInt(3, prod.getPrice());
			psmt.setString(4, prod.getItemDesc());
			psmt.setDouble(5, prod.getLikeIt());
			psmt.setString(6, prod.getCategory());
			psmt.setString(7, prod.getItemImg());
			
			
			int r = psmt.executeUpdate(); 
			System.out.println(r + "건 입력했드ㅏ....");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

	public List<Product> getProductList(String category) {
		conn = DBCon.getCon();
		String sql = "select * from product where category = nvl(\'"+category+"\' , category)" ;
		List<Product> prod = new ArrayList<>();
		
		try {
			psmt = conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				Product pro = new Product();
				pro.setItemNo(rs.getString("item_no"));  //get()괄호 안은 sql문이라서 대소구분x
				pro.setItemName(rs.getString("item_name"));
				pro.setPrice(rs.getInt("price"));
				pro.setItemDesc(rs.getString("item_desc"));
				pro.setLikeIt(rs.getDouble("like_it"));
				pro.setCategory(rs.getString("category"));
				pro.setItemImg(rs.getString("item_img"));
				
				prod.add(pro);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return prod;
	}
}
