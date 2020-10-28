package com.yedam.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmpInfoServlet")
public class GetEmpInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetEmpInfoServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = request.getParameter("id");
		EmpDAO dao = new EmpDAO();
		Employee emp = dao.getEmpInfo(empId);
		String json = "{\"id\":\"" + emp.getEmployeeId() 
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
		
		response.getWriter().append(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
