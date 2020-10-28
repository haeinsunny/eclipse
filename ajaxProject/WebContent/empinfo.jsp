<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInfo.jsp</title>
<style type="text/css">
div#detail {
	height: 270px;
	border: 3px solid purple;
	background: pink;
	padding: 15px;
	font-size: 20px;
}

div#detail>label {
	background: violet;
	color: white;
	width: 100px;
	display: inline-block;
	padding: 2px 5px;
	margin: 5px;
	border: 2px solid purple;
}

div#detail>button {
	width: 60px;
	background: purple;
	color: white;
	position: relative;
	margin: 10px;
	font-size: 20px;
	padding: 5px;
}

div#detail>input {
	font-size: 20px;
}
div#detail>select {
	font-size: 20px;
	
}
</style>
</head>
<body>
	<%
		String empId = request.getParameter("id");
	%>
	<h1>
		아이디:
		<%=empId%></h1>
	<div id="detail">

		<label for="eid">EmpId</label> <input type="text" id="eid" value='100'
			readonly><br> <label for="fName">FirstName</label> <input
			type="text" id="fName" value='100'><br> <label
			for="lName">LastName</label> <input type="text" id="lName"
			value='100'><br> <label for="salary">Salary</label> <input
			type="text" id="salary" value='100'><br> <label
			for="job">Job</label><select id="job">
			<option value="AD_PRES">President</option>
			<option value="AD_VP">Administration Vice President</option>
			<option value="AD_ASST">Administration Assistant</option>
			<option value="AC_MGR">Accounting Manager</option>
			<option value="AC_ACCOUNT">Public Accountant</option>
			<option value="SA_MAN">Sales Manager</option>
			<option value="SA_REP">Sales Representative</option>
			<option value="ST_MAN">Stock Manager</option>
			<option value="ST_CLERK">Stock Clerk</option>
			<option value="IT_PROG">Programmer</option>
			<option value="MK_MAN">Marketing Manager</option>
			<option value="MK_REP">Marketing Representative</option>
		</select><br>

		<button id="changeBtn">OK</button>

	</div>

	<script>
       let xhtp = new XMLHttpRequest();	
       xhtp.onreadystatechange = function (){
	    if(xhtp.readyState ==4 && xhtp.status == 200){
	   console.log(xhtp.responseText);	
	   let data = JSON.parse(xhtp.responseText);  //자바스크립트 오브젝트 파일로 변경(json->자바스크립트 오브젝트)
	   console.log(data.id, data.firstName, data.lastName, data.jobId);  //변수이름으로 가져오게끔	
       document.getElementById('eid').value = data.id;
       document.getElementById('fName').value = data.firstName;
       document.getElementById('lName').value = data.lastName;
       document.getElementById('salary').value = data.salary;
       document.getElementById('job').value = data.jobId;
      
	    }
	
    }
        xhtp.open('get', 'GetEmpInfoServlet?id=<%=empId%>');
		xhtp.send();

		//버튼에 이벤트 등록
		let btn = document.getElementById('changeBtn');
		btn.addEventListener('click', myChangeFunc);

		//버튼이벤트 콜백함수
		function myChangeFunc() {
			let eid = document.getElementById('eid').value; //값들을 파라미터로 넘기는 작업
			let fName = document.getElementById('fName').value;
			let lName = document.getElementById('lName').value;
			let salary = document.getElementById('salary').value;
			let job = document.getElementById('job').value;
			let param = 'eid=' + eid + '&fName=' + fName + '&lName=' + lNam	e
					+ '&salary=' + salary + '&job=' + job;
			let xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (xhttp.readyState == 4 && xhttp.status == 200) {
					console.log(xhttp.responseText);
					//location.href = "index.html";
				}
			}
			xhttp.open('get', 'PutEmpInfoServlet?' + param);
			xhttp.send();
		}
	</script>
</body>
</html>






