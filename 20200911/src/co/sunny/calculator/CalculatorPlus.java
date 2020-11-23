package co.sunny.calculator;

import co.sunny.inheritance.Calculator; //다른패키지라서 자동 임포트

public class CalculatorPlus extends Calculator { //뺄셈기능 추가한 클래스 생성

	public int sub(int m, int n){
	return (m>=n)? m-n : n-m;
	
	}
	
	public float sub(float m, int n){
	    float result = (m >= n)? m-n : n-m;
		return (m>=n)? m-n : n-m;

	}
}
