//modal 자바스크립트
function showModal(arg) {
	var modal = document.getElementById("myModal");
	modal.style.display = "block";

	var span = document.getElementsByClassName("close")[0];
	span.onclick = function () { //close라고하는  class 클릭하면 span영역을 none으로 보여지도록 하겠다
		modal.style.display = "none";
	}
	window.onclick = function (event) { //이런구문은 event가 click event가 된다
		if (event.target == modal) {
			modal.style.display = "none";
			
		}
	}
	var saveBtn = document.getElementById('saveBtn');  //모달창에서 이벤트가 입력되도록
	saveBtn.onclick = function () {
		let title = document.getElementById('title').value;
		let start = document.getElementById('startDate').value;
		let end = document.getElementById('endDate').value;
		console.log(title, start, end);
 
		if (title) {
			calendar.addEvent({ //이벤트(스케줄)를 등록하면			
				title: title, //이렇게 넣는 작업해줌
				start: arg.start, //위에서 var를 안쓰면 이렇게-> start: arg.start
				end: arg.end, //var 선언했으면 end: end
				allDay: false
			})
			createSchedule(title, start, end); //DB에 새로운 한건 등록 ->servlet으로
		}
		calendar.unselect()
	}

}

//1. servlet -> title, start_date, end_date 가지고오는 method
//2. JSON 타입으로 [{title:값, start:값, end:값}, {}, {}]
//3. events: javascript의 object 타입으로 할당하기
//4. DB등록 및 삭제
let events = [];
var calendar;

document.addEventListener('DOMContentLoaded', function () { //document에 DOMContentLoaded할때 func을 실행하는 이벤트를 등록함
	var calendarEl = document.getElementById('calendar'); //calendarEl에 해당결과값(Id('calendar'))을 넣겠다.

	let xhtp = new XMLHttpRequest(); //ajax로 서버열어주기
	xhtp.onreadystatechange = function () {
		if (xhtp.readyState == 4 && xhtp.status == 200) {
			//console.log(xhtp.response);
			let data = xhtp.response; //결과값을 data로 받겠다
			data.forEach(function (item) { //servlet을 통해 기초 할당값을 받아와서 데이터 건수만큼  data에 담는 함수를 실행하세요
				events.push(item); //이벤트에 값이 들어간다음				
			});
			console.log(data);
			
			//events에 기초값이 들어가고 그 다음에 캘린더를 만들도록 하기
			calendar = new FullCalendar.Calendar(calendarEl, { //calendar선언. FullCalendar의 Calendar를 불러오는데 매개값은 calendarEl
				headerToolbar: {
					left: 'prev,next today',
					center: 'title',
					right: 'dayGridMonth,timeGridWeek,timeGridDay'
				},
				initialDate: '2020-11-12', //첫페이지에 나오는 달력 및 오늘날짜 노란색을 뜻함
				navLinks: true, // can click day/week names to navigate views
				selectable: true,
				selectMirror: true,
				
				select: function (arg) {
					console.log(arg);
		   			let startDate = document.getElementById('startDate');  //클릭일을 시작일로 지정
					startDate.value = arg.startStr; 					
					console.log(arg.startStr);
					
					let endDate = document.getElementById('endDate');
					endDate.setAttribute('min', arg.startStr);
					console.log(endDate);
					
					// var title = prompt('스케줄을 등록하세요:');  //window alter에 뜨는것
					// let start = prompt('시작일정: ');  //
					// let end = prompt('종료일정: ');

					showModal(arg);  //showmodal에도 매개값으로 arg를 줘서 사용하자

					// if (title) {
					// 	calendar.addEvent({ //이벤트(스케줄)를 등록하면			
					// 		title: title, //이렇게 넣는 작업해줌
					// 		start: arg.start, //위에서 var를 안쓰면 이렇게-> start: arg.start
					// 		end: arg.end, //end: arg.end
					// 		allDay: false
					// 	})
					// 	createSchedule(title, start, end); //DB에 새로운 한건 등록 ->servlet으로
					// }
					// calendar.unselect();
				},

				eventClick: function (arg) { //DB에 한건 삭제 ->servlet으로
					if (confirm('일정을 삭제하겠습니까?')) {
						arg.event.remove();
						let title = arg.event.title;
						let start = arg.event.start;
						if (start.getDate() < 10)
							start = start.getFullYear() + '-' + (start.getMonth() + 1) + '-0' + start.getDate(); //date타입으로 만들어줌 (10보다 작은숫자는 0붙여줌)
						else
							start = start.getFullYear() + '-' + (start.getMonth() + 1) + '-' + start.getDate();

						deleteSchedule(title, start);

					}
				},
				editable: true,
				dayMaxEvents: true, // allow "more" link when too many events
				events: events //기초값 할당되어있어서 events가 설정되어있는채로 뜰거임
				//원본: 키, 밸류 형태 -> 이런 형태로 웹에서 데이터를 가져오는 servlet이 있어야함

			}); //cal만드는 메소드 호출부분임
			calendar.render();
		}
	}
	xhtp.responseType = 'json'; //json으로 데이터를 받아오면 자동으로 자바스크립트의 오브젝트 형태로 변경해줌
	xhtp.open('get', '../../GetScheduleServlet'); //상대경로 맞춰주기
	xhtp.send();

});

function createSchedule(v1, v2, v3) { //캘린더에 update하는 servlet호출하기 (각각 title, start, end가 들어가면됨)
	let xhtp = new XMLHttpRequest();
	xhtp.onreadystatechange = function () {
		if (xhtp.readyState == 4 && xhtp.status == 200) {

		}
	}
	xhtp.open('get', '../../PutSchedulServlet?title=' + v1 + '&start=' + v2 + '&end=' + v3); //get방식으로 '&start='+v2 한묶음!!
	xhtp.send();

}

function deleteSchedule(v1, v2) { //캘린더에 delete하는 servlet호출하기
	let xhtp = new XMLHttpRequest();
	xhtp.onreadystatechange = function () {
		if (xhtp.readyState == 4 && xhtp.status == 200) {

		}
	}
	xhtp.open('get', 'DelScheduleServlet?title=' + v1 + '&start=' + v2); //servlet에서 경로지정 미리 해줬기 때문에 그냥 쓰면됨
	xhtp.send();
}