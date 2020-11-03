//product.js
// /GetProdListServlet 얘로 찾아가는 경로
// /cafe/index.html

$.ajax({
	url: '../GetProdListServlet',
	dataType: 'json',
	success: function (result) {
		console.log(result);
		
		for(obj of result){  //결과 data만큼 createRow 형식을 만든다
			createRow(obj);
		}
	}

});
//html 중에 얘를 제이쿼리로 만들기
/* <div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#"><img class="card-img-top"
								src="http://placehold.it/700x400" alt=""></a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Item One</a>
								</h4>
								<h5>$24.99</h5>
								<p class="card-text">Lorem ipsum dolor sit amet, consectetur
									adipisicing elit. Amet numquam aspernatur!</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733;
									&#9733; &#9734;</small>
								<!-- &#9733: 별모양 표시, &#9734:빈 별모양 -->
							</div>
						</div>
					</div> */
function createRow(obj){
	let div1 = $('<div />').attr('class', 'col-lg-4 col-md-6 mb-4');
	let div2 = $('<div />').attr('class', 'card h-100');
	let a = $('<a />').attr('href', '#');  //div2 하위의 a라는 뜻으로 네이밍
	let img = $('<img />').attr({'class':'card-img-top', 'src':'../images/coffee.jpg', 'alt':''})  //보여줄 이미지가 없을때 alt속성이 보여진다
	let div2_div = $('<div />').attr('class', 'card-body');
	let h4 = $('<h4 />').attr('class', 'card-title');
	let h4_a = $('<a />').attr('href', '#').html(obj.itemName); //각 이름에 맞는 데이터를 가져옴

	let price = new Intl.NumberFormat('ko-KR', {style:'currency', currency:'KRW'}).format(obj.price);  //원화로 바꾸기(넘버포맷 구글서치)

	let h5 = $('<h5 />').html(price); //각 데이터마다 가격을 가지고옴
	let p = $('<p />').attr('class', 'card-text').html(obj.itemDesc); //각 데이터에 맞는 설명을 가져옴
	let div2_div2 = $('<div />').attr('class', 'card-footer');
	
	let like = Math.floor(obj.likeIt); //Math.floor은 바닥값이라는 뜻. (4.5라면 소숫점을 뺀 바닥값 4를 뜻한다)
	
	let star = "";  //평점찍기	
	 for(let i=0; i < like; i++){
	 	star += '<i style="font-size:15px" class="fas">&#xf005;</i>';
	 }
	 if(obj.likeIt > like){
	 	star += '<i style="font-size:15px" class="fas">&#xf089;</i>';
	 }

	 let small = $('<small />').attr('class', 'text-muted').html(star);

//	let ic = "";
//	for(let i=0; i < like; i++){	
//		ic += '<i style="font-size:20px" class="material-icons">&#xe8dc;</i>';  //구글꺼. html에 link주소 첨부하기
//	}
//	if(obj.likeIt > like){
//		ic += '<i style="font-size:15px" class="material-icons">&#xe8dc;</i>';
//	}

//	let small = $('<small />').attr('class', 'text-muted').html(ic);
	

	h4.append(h4_a);
	div2_div.append(h4, h5, p);
	a.append(img);
	div2_div2.append(small);
	div1.append(div2);
	div2.append(a, div2_div, div2_div2);
	$('#data').append(div1);

}