<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>여기는 member.jsp파일입니다.</h1>
<a href="../../index.jsp">홈페이지</a> <!-- JSP폴더가 내 부모. member폴더는 그냥 내 디렉토리임 -->
<p></p>
<!-- <a href="/index.jsp">돌아가기</a> 톰캣서버 홈으로 감. 이렇게 경로지정할때는 밑에처럼 루트명부터 지정해주기-->
<a href="/Hello/index.jsp">돌아가기</a> <!-- 루트페이지 http://localhost/Hello/index.jsp 의  /Hello/index.jsp 경로 참조-->
</body>
</html>