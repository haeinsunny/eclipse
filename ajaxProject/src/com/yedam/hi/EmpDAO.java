package com.yedam.hi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yedam.common.DBCon;

public class EmpDAO {
	PreparedStatement psmt;
	ResultSet rs;
	Connection conn;
	
	public void updateEmpInfo(String eid, String f, String l, String s, String j) {  //salary update하는것
		conn = DBCon.getCon();
		String sql = "update employees set salary=?, job_id=? where employee_id =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, s);  //1: 1번째 파라미터
			psmt.setString(2, j);
			psmt.setNString(3, eid);
			
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 변경완료");
			
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

	public Map<String, Integer> getMemberPerDept() { // getMemberPerDept()함수를 호출하면 Map<String, Integer>타입으로 반환하겠다
		conn = DBCon.getCon();
		String sql = "select d.department_name, e.cnt\r\n" + "from(select department_id, count(*) as cnt\r\n"
				+ "from employees\r\n" + "group by department_id) e, departments d\r\n"
				+ "where e.department_id = d.department_id"; // 이 쿼리를 넣어서 실행하겠다.
		
		Map<String, Integer> MemberPerDept = new HashMap<>();  //MemberPerDept라는 HashMap 클래스변수를 선언해서 여기에 담음
		
		try {
			psmt = conn.prepareStatement(sql);  //위의 쿼리를 가져옴
			rs = psmt.executeQuery();
			while(rs.next()) {   //rs만큼 루핑돈다
				MemberPerDept.put(rs.getString("department_name"), rs.getInt("cnt"));  //키-밸류 형식을 만드는것
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return MemberPerDept; // return 값 줘야 호출하는데서 오류 안남
	}

	public Employee getEmpInfo(String empId) {
		conn = DBCon.getCon(); // 계속 연결시도하면 오라클 리스너가 접속할 여유를 안줌
		Employee emp = new Employee();
		try {
			psmt = conn.prepareStatement("select * from employees where employee_id =?");
			psmt.setString(1, empId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("department_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
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

		return emp;

	}

	public List<Employee> getEmpList() { // EmpList()을 불러오면 List<Employee>타입으로 반환해준다
		conn = DBCon.getCon();
		List<Employee> employees = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from employees order by 1");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("department_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
