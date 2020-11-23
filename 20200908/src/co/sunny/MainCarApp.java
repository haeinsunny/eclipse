package co.sunny;

public class MainCarApp {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Black"; //색 지정
		car.engine = "2500cc";  //엔진 지정
		car.run();
		car.stop();
		System.out.println(car.color); //출력
		System.out.println(car.engine);
		
	}

}
