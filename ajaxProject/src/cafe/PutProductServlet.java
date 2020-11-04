package cafe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PutProductServlet")
public class PutProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PutProductServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //요청정보에 한글인식 넣어주기
		response.setCharacterEncoding("utf-8");  //응답정보에도 넣어주기
		response.setContentType("text/html; charset = utf-8");
		
		String itemNo = request.getParameter("itemNo");  //request: 요청정보를 넘김
		String itemName = request.getParameter("itemName"); //prouct.html의 테이블 input name임
		String price = request.getParameter("price");
		String itemDesc = request.getParameter("itemDesc");
		String likeIt = request.getParameter("likeIt");
		String category = request.getParameter("category");
		String itemImg = request.getParameter("itemImg");
		
		Product prod = new Product();  //prod에 담음
		prod.setItemNo(itemNo);
		prod.setItemName(itemName);
		prod.setPrice(Integer.parseInt(price));  //parseInt string 타입의 문자를 int타입으로 변환해준다
		prod.setItemDesc(itemDesc);
		prod.setLikeIt(Double.parseDouble(likeIt));
		prod.setCategory(category);
		prod.setItemImg(itemImg);
		
		ProductDAO dao = new ProductDAO();
		dao.insertProduct(prod);
		
		PrintWriter out = response.getWriter();
		out.print("<script>location.href=\"cafe/index.html\";</script>");
//		out.print("<script>alert(\"ok\")</script>");  //스크립트 태그안에 alter창 띄우는거 넣음
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);  //doPost하고 다시 doGet을 불러오고있음
	}

}
