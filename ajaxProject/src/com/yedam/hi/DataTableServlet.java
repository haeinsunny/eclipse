package com.yedam.hi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataTableServlet")  //최상위에 위치해 있다는 뜻. data.js대신 같은형식으로 뿌려주게 servlet 사용
public class DataTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DataTableServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//{"draw": 1,"recordsTotal": 57, "recordsFiltered": 57,  //데이터가 총 몇개인지
		// "data": [[val1, val2, val3, val4, ....val6],[val1, val2, val3, val4, ....val6]
		//}
		EmpDAO dao = new EmpDAO();
		List<Employee> employees = dao.getEmpList();
		int dataCnt = employees.size();
		String json = "{\"draw\":1, \"recordsTotal\": "+ dataCnt + ", \"recordsFiltered\": "+
						dataCnt + ", ";
		json += "\"data\": [";
		
		for(int i = 0; i<dataCnt; i++) {   //데이터만 돌게끔
			json += "[";
			json += ""+employees.get(i).getEmployeeId()+",\""
			+employees.get(i).getFirstName()+"\",\""
					+employees.get(i).getEmail()+"\",\""
			+employees.get(i).getPhoneNumber()+"\",\""
					+employees.get(i).getDepartmentId()+"\","
			+employees.get(i).getSalary();   
			json += "]";
						
			if((i + 1) != dataCnt) //i와 dataCnt비교해서				
				json += ", ";    //마지막엔 , 없이
		}
			json += "]}";
			response.getWriter().append(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
