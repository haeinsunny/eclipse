package co.carTest;

import co.sunny.Car; //가져오기

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car = new Car(); //다른패키지에서 가져오려면 import해야함
        car.color = "Red";
        car.run();  //stop은 불러올수없다. co.sunny에서의 접근지시자의 범위 때문에
           System.out.println(car.color);
	
	}
	
}
