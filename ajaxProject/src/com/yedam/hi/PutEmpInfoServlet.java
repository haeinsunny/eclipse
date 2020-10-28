package com.yedam.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PutEmpInfoServlet")
public class PutEmpInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PutEmpInfoServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String salary = request.getParameter("salary");
		String job = request.getParameter("job");
		
		//디비에서 수정하는 기능 추가 (EmpDAO에서 하는것)
		EmpDAO dao = new EmpDAO();
		dao.updateEmpInfo(eid, fName, lName, salary, job);
		response.getWriter().append("complete");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
