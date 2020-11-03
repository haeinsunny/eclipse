package cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DBCon;

public class ProductDAO {
	Connection conn; // 자바.sql에 있는 구문들
	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	public void inserProduct(Product prod) {
		
	}

	public List<Product> getProductList() {
		conn = DBCon.getCon();
		String sql = "select * from product";
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
