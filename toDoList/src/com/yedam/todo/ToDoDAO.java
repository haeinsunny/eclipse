package com.yedam.todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DBCon;

public class ToDoDAO {
	PreparedStatement psmt;
	ResultSet rs;
	Connection conn;
	String sql;

	// DB조회
	public List<ToDo> getToDoList() {
		conn = DBCon.getCon();
		List<ToDo> todo = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from schedule");
			rs = psmt.executeQuery();

			while (rs.next()) {
				ToDo to = new ToDo();
				to.setTitle_no(rs.getInt("title_no"));
				to.setTitle(rs.getString("title"));
				to.setAppoint_time(rs.getString("appoint_time"));
				to.setMeeting_place(rs.getString("meeting_place"));
				to.setContent(rs.getString("content"));

				todo.add(to);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return todo;
	}

	// DB등록
	public String insertToDo(ToDo todo) {
		conn = DBCon.getCon();
		String r = null;
		String sql2 = "select schedule_seq.nextval from dual";
		String sql = "insert into schedule values(?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql2);
			rs = psmt.executeQuery();
			if (rs.next()) {
				r = rs.getString(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, r);
			psmt.setString(2, todo.getTitle());
			psmt.setString(3, todo.getAppoint_time());
			psmt.setString(4, todo.getMeeting_place());
			psmt.setString(5, todo.getContent());

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

	// DB삭제
	public void deleteToDo(String id) {
		conn = DBCon.getCon();
		String sql = "delete from schedule where title_no=?";
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
}
