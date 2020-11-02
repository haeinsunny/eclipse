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

@WebServlet("/GetScheduleServlet")
public class GetScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public GetScheduleServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray jAry = new JSONArray();
		EmpDAO dao = new EmpDAO();
		List<FullCalendar> list = dao.getSchedules();
		for(FullCalendar cal : list) {
			JSONObject obj = new JSONObject();  //JSONObject를 선언해서 JSON형식으로 넣을거임
			obj.put("title", cal.getTitle());
			obj.put("start", cal.getStartDate());
			obj.put("end", cal.getEndDate());
			jAry.add(obj);
		}
		response.getWriter().append(JSONArray.fromObject(jAry).toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
