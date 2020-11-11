package com.yedam.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

@WebServlet("/GetToDoServ")
public class GetToDoServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetToDoServ() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		ToDoDAO dao = new ToDoDAO();

		String cmd = request.getParameter("cmd"); // "cmd": html에 넘겨줄 값

		if (cmd.equals("selectAll")) {
			List<ToDo> list = dao.getToDoList();
			JSONArray jAry = new JSONArray();
			for (ToDo todo : list) {
				jAry.add(todo);
			}
			response.getWriter().append(JSONArray.fromObject(jAry).toString());

		} else if (cmd.equals("insert")) {
			String title = request.getParameter("title");
			String time = request.getParameter("appoint_time");
			String place = request.getParameter("meeting_place");
			String content = request.getParameter("content");

			ToDo todo = new ToDo();
			todo.setTitle(title);
			todo.setAppoint_time(time);
			todo.setMeeting_place(place);
			todo.setContent(content);

			String r = dao.insertToDo(todo);
			response.getWriter().append(r);

		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");
			dao.deleteToDo(id);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
