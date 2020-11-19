<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<!-- 위 문장은 서블릿의 response.setContentType("text/html");과 response.setCharacterEncoding("utf-8"); 이 두 줄로 대체된다-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우리회사</title>
</head>
<body>
<h1>여기는 우리회사 홈페이지 입니다.</h1>
<h1>대한민국</h1>
<h1>My name is SUNNY</h1>
<h1>대구광역시</h1>
<h1>예담직업전문학교</h1>
<form id="frm" name="frm" action="a" method="post"> <!-- get, post방식에 따라 서블릿에서 표현한게 다르다 확인하기 -->
<!-- action="a" 이면 web.xml의 url맵핑방식 따라간다 -->
	아이디: <input type="text" id="id" name="id">
	<input type="submit" value="전송">
	<input type="reset" value="취소">
</form>
</body>
</html>