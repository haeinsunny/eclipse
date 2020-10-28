package com.yedam.hi;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetMemberPerDeptServ")
public class GetMemberPerDeptServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetMemberPerDeptServ() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmpDAO dao = new EmpDAO(); // 1 생성자 호출 인스턴스생성
		Map<String, Integer> members = dao.getMemberPerDept(); // 2생성자 호출, getMemberPerDept()타입 확인해서 넣어주기
		Set<String> keySet = members.keySet(); // 3key만가져와서 set해줌
		String json = "["; // 6
		int cnt = 0, dataLength = keySet.size(); // 7
		for (String key : keySet) { // 4key를 담아준다.
			System.out.println(key + ", " + members.get(key)); // 5key값을 가져오고 members.get(key)로 value를 가져온다.
			json += "{\"" + key + "\":" + members.get(key) + "}"; // 8
			cnt++;  //해야 마지막에 ,가 안생김
			if (cnt != dataLength) { // 9
				json += ",";
			}
		}
		json += "]";// 6
		response.getWriter().append(json); // 10
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
