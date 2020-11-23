
function showList(result){      //성공하면 실행할 함수(결과값)
	console.log(result);
	let data = result;
	console.log(data);
	let ul = $('<ul />');

    //data.forEach(item, idx)=>{}  //밑의 람다식 표현
	data.forEach(function(item, idx) { //data건수만큼 루핑  item:배열 한건 idx:item이 가지고있는 id
	let li = $('<li />').html(item.id + ", ").attr('id', item.id); //html:넣을 텍스트내용, attr:이벤트 주기위해 id값도 지정함
	//li.mouseover(function({}))
	
	  //'mouseover' : mouseOverFunc,  //1. mouseOverFunc 함수 불러와서 쓸때
	  //'mouseover' : mof(item), //2. 이렇게하면 안됨! ():실행구문 페이지 열다가도 ()확인하면 실행하게됨
                                 // (item): mof함수에 매개값으로 item을 넘겨줌	
	  //'mouseover' : mof   //3. item 안넘겨줄거임 그럼 함수에서 어떻게되는지 확인

	  $(li).on({ //on이라는 이벤트를 등록하는 메소드
      'mouseover' : mouseOverCallback,  //4.
	  'mouseout' : function() {
	   $(this).css('background', '');
		},
	});

	//let aTag = $('<a />').html(item.firstName).attr('href', 'empInfo.jsp?id=' + item.id); //a태그에 firstName을 이름으로 지정함  
	let aTag = $('<a />').html(item.firstName).attr('href', 'jquery_empinfo.jsp?id=' + item.id);  //제이쿼리로 링크 바꿔주기
	 li.append(aTag);
	 ul.append(li);
  //4. localStorage가 가지고있는 setItem메소드를 가져와서 name을 item.id라고 지정하겠다. (키, 밸류)타입
	 localStorage.setItem('eid'+item.id, item.id); //동일한 이름이 있으면 마지막 이름의 아이디를 불러오기때문에'eid'+item.id라는 키를 만듬 
	 localStorage.setItem('fNm'+item.id, item.firstName);
 	 localStorage.setItem('lNm'+item.id, item.lastName);
  	 localStorage.setItem('eml'+item.id, item.email);
	 localStorage.setItem('sal'+item.id, item.salary);
	 localStorage.setItem('job'+item.id, item.jobId);
	});
	 $('#result').append(ul);
}

//function mof(item){ //2. item을 쓰려면 매개값으로 받아와야함(안되는것!!페이지 열자마자 바로 item이 불러와짐)
	//console.log(item);   //3. ()에 받아온게 아무것도 없으면 매개값을 event로 인식함(console에 current target뜨는것 참조)
	//$(this).css('background', 'yellow');
//	$('#eid').val(result.id);
//	$('#fName').val(result.firstName);
//	$('#lName').val(result.lastName);
//	$('#email').val(result.email);
//	$('#salary').val(result.salary);
//	$('#job').val(result.jobId);
//}

function mouseOverCallback(event){  //4. 지정해놓은 localStorage을 가져옴
	console.log(event)
	let eid = localStorage.getItem('eid' + event.currentTarget.id);
	let fNm = localStorage.getItem('fNm' + event.currentTarget.id);
	let lNm = localStorage.getItem('lNm' + event.currentTarget.id);
	let eml = localStorage.getItem('eml' + event.currentTarget.id);
	let sal = localStorage.getItem('sal' + event.currentTarget.id);
	let job = localStorage.getItem('job' + event.currentTarget.id);
	
	        $('#eid').val(eid);
			$('#fName').val(fNm);
			$('#lName').val(lNm);
			$('#email').val(eml);
			$('#salary').val(sal);
			$('#job').val(job);
	//console.log(name);
}

//function mouseOverFunc(){  //1.
//	$(this).css('background', 'yellow');
//	let id = $(this).attr('id');  //마우스를 올릴때마다 'id'를 읽어오겠다. (괄호)가 비었으면 넣은값을 받아오겠다는 뜻
	
//	$.ajax({
//		url: 'GetEmpInfoServlet?id=' + id,
//		data: {
//			id: id   //이런형식으로 id를 받아오기 위해 데이터타입 지정해줌
//			}, 
//		success: function(result){
//			console.log(result);
//			//jquery_index.html input태그의 value속성에 값을 할당
//			//result.firstName
//			$('#eid').val(result.id);
//			$('#fName').val(result.firstName);
//			$('#lName').val(result.lastName);
//			$('#email').val(result.email);
//			$('#salary').val(result.salary);
//			$('#job').val(result.jobId);
//		},
//		dataType:'json'
//	})
//}

 









