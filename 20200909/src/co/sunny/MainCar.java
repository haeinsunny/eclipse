package co.sunny;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Car car = new Car("소나타", "Black"); //생성자와 매개변수 똑같이 입력
		car.toString();

		Car car1 = new Car();
		car1.toString();
		
		Car car2 = new Car("K5", "White", "2000cc");
		car2.toString();
	}

}
