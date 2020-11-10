package com.yedam.book;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

@WebServlet("/GetBookServlet")
public class GetBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetBookServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		BookDAO dao = new BookDAO();

		String cmd = request.getParameter("cmd"); // "cmd": html에 넘겨줄 값

		if (cmd.equals("selectAll")) {
			List<Book> list = dao.getBookList();
			JSONArray jAry = new JSONArray();
			for (Book book : list) {
				jAry.add(book);
			}
			response.getWriter().append(JSONArray.fromObject(jAry).toString());
			
		} else if (cmd.equals("insert")) {
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String price = request.getParameter("price");
			
			Book book = new Book();
			book.setBookTitle(title);
			book.setBookAuthor(author);
			book.setBookPrice(Integer.parseInt(price));
			
			String r = dao.insertBook(book);
			response.getWriter().append(r);
			
		}else if(cmd.equals("delete")) {
			String id = request.getParameter("id");
			BookDAO book = new BookDAO();
			dao.deleteBook(id);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
