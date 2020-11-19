package co.sunny.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.serialize.Printer;

/**
 * Servlet implementation class HelloServlet 서블릿 클래스란? 자바로 만든 web page이다 브라우저에
 * 표현해주려면 HTML을 사용해야한다 JSP파일은 컨테이너가 .JAVA 파일로 변환하고 .class를 실행한다. 하지만, 서블릿은 이미
 * 자바로 만들어졌기 때문에 컴파일만 해서 .class를 실행하면되기 때문에 처리속도가 빠르다 컨테이너 거치는게 속도에 영향을 미친다.
 * 유저에게 빠른 환경을 제공해주기위해서 서블릿을 사용한다. 서블릿은 프로그램에서 단 1~2개만 만든다. Controller기능
 */
@WebServlet("/HelloServlet") // 권장하지않는방법
//어노테이션 막아버리면 이 서블릿 페이지 404 에러뜸 http://localhost/Test/co.sunny.first.HelloServlet 이런식으로 기존경로를 써줘야함. 또는 url맵핑
//어노테이션 풀어주면 1.어노테이션 방법과 2.url맵핑방법 두가지 다 사용가능하다 
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청처리객체와, 응답처리객체를 매개변수로 받는다. 서버는 브라우저로부터 요청(request, url페이지요청하는것 등)받고
		// 응답(response)을 한다.

		response.setContentType("text/html"); // 이 서블릿에서 표현하고 싶은것을 HTML로 표현해보자
		response.setCharacterEncoding("utf-8"); // response를 한글 안깨지도록하는 인코딩
		PrintWriter out = response.getWriter(); // response를 getWriter를 통해서 출력하겠다.

//		out.println("<html>");
//		out.println("<head>");
//		out.println("<body>");
//		out.println("<h1>KOREA, 대한민국</h1>");
//		out.println("<h1>My name is SUNNY</h1>");
//		out.println("<h1>대구광역시</h1>");
//		out.println("<h1>예담직업전문학교</h1>");
//		out.println("</body>");
//		out.println("</head>");
//		out.println("</html>");
//		
//		out.close(); //웹 브라우저에 이런방식으로 표현하는것을 대체하기위해 JSP페이지에 만든다

		String id = request.getParameter("id"); // index.jsp의 폼에서 넘어온 값, get방식으로 넘어온값 처리는 여기에 표현한대로

		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1> 입력된 값은 " + id + "</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		out.close();

		System.out.println("서블릿 클래스를 확인합니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {  //post방식으로 넘어온 값 표현할떄
		
		response.setContentType("text/html"); 
		response.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id"); 
		
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1> " + id + " 님 환영합니다.</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		out.close();
	}

}
