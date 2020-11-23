/*
 * Method Overloading Test
 */
package co.calculator;

public class Calculator {

	public int sum(int m, int n) { //메소드 오버로딩(인자 매개변수를 다르게 주는것)
	
	return m + n;
	
    }
	
	public float sum(float m, float n) {
		return m + n;

	}
	
	public float sum(int m, float n) {
		return m + n;
    }
	
	public float sum(float m, int n) {
		return m + n;
	}
	
	public int sum(int m, int n, int l) {
		return m + n +l;
	}
	
}
