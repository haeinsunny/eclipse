package com.yedam.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

import com.yedam.common.DBCon;

public class BookDAO {
	PreparedStatement psmt;
	ResultSet rs;
	Connection conn;
	String sql;
	
	//DB수정
	public void updateBook(String title, String author, int price, String id) {
		conn = DBCon.getCon();		
		String sql = "update book set book_title=?, book_author=?, book_price=? where book_no=?";
		try {
			psmt = conn.prepareStatement(sql);		
			psmt.setString(1,title);
			psmt.setString(2, author);
			psmt.setInt(3, price);
			psmt.setString(4, id);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	

	// DB삭제
	public void deleteBook(String id) {

		conn = DBCon.getCon();
		String sql = "delete from book where book_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	// DB조회
	public List<Book> getBookList() { // EmpList()을 불러오면 List<Employee>타입으로 반환해준다
		conn = DBCon.getCon();
		List<Book> book = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from book order by 1");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Book bo = new Book();
				bo.setBookNo(rs.getInt("book_no"));
				bo.setBookTitle(rs.getString("book_title"));
				bo.setBookAuthor(rs.getString("book_author")); // Book클래스-DB sql문
				bo.setBookPrice(rs.getInt("book_price"));

				book.add(bo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	// DB등록
	public String insertBook(Book book) {
		conn = DBCon.getCon();
		String r = null;
		String sql2 = "select book_seq.nextval from dual";
		String sql = "insert into book values(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql2);
			rs = psmt.executeQuery();
			if (rs.next()) {
				r = rs.getString(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, r);
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookAuthor());
			psmt.setInt(4, book.getBookPrice());

			int rr = psmt.executeUpdate();
			System.out.println(rr + "건 등록되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return r;
	}

}
