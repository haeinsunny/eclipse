package com.yedam.hi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmployeesListServlet")
public class GetEmployeesListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetEmployeesListServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
//		{"name":"Hong", "age":20, "score":80}

		String json = "[";
		int dataCnt = list.size();
		int i = 0;
		
		for (Employee emp : list) {
			json += "{\"id\":\"" + emp.getEmployeeId() 
			          + "\",\"firstName\":\"" + emp.getFirstName()
			          + "\",\"lastName\":\"" + emp.getLastName()
			          + "\",\"email\":\"" + emp.getEmail()
			          + "\",\"phonenumber\":\"" + emp.getPhoneNumber()
			          + "\",\"hireDate\":\"" + emp.getHireDate()
			          + "\",\"jobId\":\"" + emp.getJobId()
			          + "\",\"salary\":\"" + emp.getSalary()
			          + "\",\"commissionpct\":\"" + emp.getCommissionPct()
			          + "\",\"managerId\":\"" + emp.getManagerId()
			          + "\",\"deptId\":\"" + emp.getDepartmentId() 
			          + "\"}";
			i++;
			if( i!= dataCnt) {
				json += ",";
			}
		}
		json += "]";

		response.getWriter().append(json);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
