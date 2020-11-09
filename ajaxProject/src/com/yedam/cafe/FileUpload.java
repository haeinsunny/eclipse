package com.yedam.cafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/FileUpload")
@MultipartConfig(location = "c:/tmp", maxFileSize = 1024000L, maxRequestSize = -1, fileSizeThreshold = 1024)
//"c:/tmp": 실제 c드라이브에 tmp파일이 있어야 오류가 안남(임시 이미지저장파일)
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FileUpload() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		Collection<Part> parts = request.getParts();
		String filename = "";
		String filepath = request.getServletContext().getRealPath("/images"); // webcontent밑에 images경로
		System.out.println(filepath);
		for (Part part : parts) {
			filename = part.getSubmittedFileName();
			System.out.println("filename: " + part.getSubmittedFileName());
			System.out.println("filesize: " + part.getSize());
			System.out.println("parameter name: " + part.getName());
			part.write(filepath + "/" + part.getSubmittedFileName()); // 경로/파일명
		}
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("opener.frm.itemImg.value= '" + filename + "';");  //frm: product.html form의 id임. 얘 value에 넣어라
		out.println("window.close();");
		out.println("</script>");
	}

}
