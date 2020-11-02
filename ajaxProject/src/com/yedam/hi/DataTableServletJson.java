package com.yedam.hi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/DataTableServletJson")  //라이브러리 활용
public class DataTableServletJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DataTableServletJson() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		int dataCnt = list.size();
		JSONObject obj = new JSONObject();  //ctl +shft + o: 임포트
		
		obj.put("draw", 1);  //(key, val)형식
		obj.put("recordsTotal", dataCnt);  //DB데이터를 가져와 쓰기 위해서 위의 4줄 필요!!
		obj.put("recordsFiltered", dataCnt);
		
		JSONArray oAry = new JSONArray();
		JSONArray iAry = new JSONArray();
		
		for(Employee emp : list) {  //바깥배열
			iAry = new JSONArray();
			iAry.add(emp.getEmployeeId());   //iAry배열에 필드 하나 담음
			iAry.add(emp.getFirstName());
			iAry.add(emp.getEmail());
			iAry.add(emp.getPhoneNumber());
			iAry.add(emp.getHireDate());
			iAry.add(emp.getSalary());
			
			oAry.add(iAry); //루핑 돌면서 iAry데이터를 oAry에 담음
		}
		
		obj.put("data", oAry);
		
		response.getWriter().append(obj.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
