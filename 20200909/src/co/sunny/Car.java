package co.sunny;

public class Car {
	private String model;
	private String color;
	private String engine;
	
	public Car() {  //기본생성자. 생성자 안에 아무것도 없어도됨. 또는 미리 설정
	model = "그랜저";
    color = "RED";// TODO Auto-generated constructor stub
    engine = "3000cc";
	}
	
	public Car(String model, String color) {  //사용자가 모델과 색상 선택하는 생성자
		this.model = model;
		this.color = color;
	    engine = "2,000cc";
	}
	public Car(String model, String color, String engine) { //모델, 색상, 배기량 선택생성자
		this.model = model;
		this.color = color;
		this.engine = engine;
		
	}
	
	public String toString() {
//		model = "그랜저";
//		color = "Red";
		System.out.println(model);
		System.out.println(color);
		System.out.println(engine);
		
		return null;
	}

	

}
