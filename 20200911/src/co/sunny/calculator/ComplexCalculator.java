package co.sunny.calculator;

import co.sunny.inheritance.Calculator;

public class ComplexCalculator { //부품을 조립하는 경우
	
	private Calculator plus = new Calculator();
	private CalculatorPlus substract = new CalculatorPlus();
	
	public int sum(int m, int n) {
		int result;
		result = plus.sum(m,  n);
		return result;
	}
	
	public int sub(int m, int n) {
		return substract.sub(m, n);
	}

}
