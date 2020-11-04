<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  <!-- index.html save_as하고나서 구문추가해주기1 -->
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<script>
<%
String itemNo = request.getParameter("itemNo");  
%>
$(document).ready(function(){
	$.ajax({
		url : 'GetProdInfoServlet?id=<%=itemNo%>',
		success: function(result){
		let data = result;
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		let itemNo = $('#itemNo').val(prod.itemNo);
		
		},
		error: function(reject){
			console.log(new Error("실행 중 에러 발생"));
		},
		dataType: 'json'
	});	
	
});
</script>
<script>
let itemNo = "<%=itemNo%>";

console.log(itemNo);
</script>

</head>

<body>
<label for="itemNo">itemNo</label> <input type="text" id="itemNo" value='100' readonly><br> 
<label for="fName">FirstName</label> <input type="text" id="fName" value='100'><br> 
<label for="lName">LastName</label> <input type="text" id="lName"value='100'><br> 
<label for="salary">Salary</label> <input type="text" id="salary" value='100'><br> 
<label for="eid">EmpId</label> <input type="text" id="eid" value='100' readonly><br> 
<label for="eid">EmpId</label> <input type="text" id="eid" value='100' readonly><br> 
<label for="eid">EmpId</label> <input type="text" id="eid" value='100' readonly><br> 

</body>

</html>

