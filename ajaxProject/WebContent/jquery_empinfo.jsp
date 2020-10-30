<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery_empinfo.jsp</title>
<script src="public/jquery-3.5.1.min.js"></script>

<script>
<%
String empId = request.getParameter("id");
%>

 $(document).ready(function(){
	$.ajax({
		url : 'GetEmpInfoServlet?id=<%=empId%>',
		success: function(result){
		let data = result;
		let eid = $('#eid').val(data.id);
		let fName =$('#fName').val(data.firstName);
		let lName =$('#lName').val(data.lastName);
		let email =$('#email').val(data.email);
		let salary =$('#salary').val(data.salary);
		let job =$('#job').val(data.jobId);		
		},
		error: function(reject){
			console.log(new Error("실행 중 에러 발생"));
		},
		dataType: 'json'
	});	
	let btn = $('#changeBtn');
	$(btn).on('click', myChangeFunc);		
});
 
 function myChangeFunc() {			
	 $.ajax({
			url : 'PutEmpInfoServlet?',
			success: function(result){
				let data = result;
				let eid = $('#eid').val(data.id);
				let fName =$('#fName').val(data.firstName);
				let salary =$('#salary').val(data.salary);
				let job =$('#job').val(data.jobId);		
				},
			data:{
				id:eid, 
	 			firstName:fName,
	 			lastName:lName,
	 			salary:salary,
	 			jobId:job
			},
	        error: function(reject){
			   console.log(new Error("실행 중 에러 발생"));
		},
		dataType: 'json'
	});	
 }
</script>

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
	
</body>
</html>






