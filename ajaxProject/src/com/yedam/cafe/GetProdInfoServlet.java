package com.yedam.cafe;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.hi.EmpDAO;
import com.yedam.hi.Employee;

import net.sf.json.JSONArray;

@WebServlet("/GetProdInfoServlet")
public class GetProdInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public GetProdInfoServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8"); // 구글에 한글깨짐현상 검색해서 해결
		
		String itemNo = request.getParameter("itemNo");  //data:{'category'를 가져와야함
		ProductDAO dao = new ProductDAO(); // 선언해야 ProductDAO가 가지고 있는 기능을 쓸수있다
		List<Product> list = dao.getProductList(itemNo); 
		//List<Product> list = dao.getProductList(); //ProductDAO class가 가지고 있는 DB관련된 메소드
		JSONArray jAry = new JSONArray(); // JSON lib 임포트.

		for (Product prod : list) { // 루핑돌면서 jAry에 담을거임
			jAry.add(prod);
		}

		response.getWriter().append(JSONArray.fromObject(jAry).toString()); // JSON데이터방식은 append 괄호안에
																			// JSONArray.fromObject(jAry)해야 표출됨.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
