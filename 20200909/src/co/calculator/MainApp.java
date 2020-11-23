package co.calculator;

public class MainApp {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		float f = myCal.sum(3.5f, 4.2f);//return을 사용할경우 출력할 틀을 같게 만들어준다.
		System.out.println("연산 값은 " + f + " 입니다."); //출력도 만들어준다

	}

}
