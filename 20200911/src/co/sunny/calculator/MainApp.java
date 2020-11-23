package co.sunny.calculator;

import co.sunny.inheritance.Calculator;

public class MainApp {

	public static void main(String[] args) {
		Calculator cal = new Calculator(); //덧셈만 필요한 경우
//		double d = cal.sum(10.2, 20.3);
//		System.out.println(d);
		
		CalculatorPlus cp = new CalculatorPlus();
//		int m = cp.sub(10, 20); //돌려줄값 앞에 지정 //덧셈과 뺄셈이 필요한 경우	
//		System.out.println("뺄셈: " + m);
		
    	ComplexCalculator cc = new ComplexCalculator();
    	int m = cc.sum(10, 20);
    	System.out.println("덧셈: " + m);
    	
    	m = cc.sub(10,20);
    	System.out.println("뺄셈: " + m);
	}

}
