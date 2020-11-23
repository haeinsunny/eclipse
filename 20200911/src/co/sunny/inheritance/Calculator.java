package co.sunny.inheritance;

public class Calculator { //덧셈기능하는 클래스 생성
	public int sum(int m, int n) { //sum이라는같은 메소드에 매개변수만 달리하여 생성:메소드 오버로딩
		return m + n;
	}

	public float sum(float m, int n) {
		return m + n;
		
	}
	
	public float sum(float m, float n) {
		return m + n;
		
	}
	
	public double sum(int m, double n) {
		return m + n;
		
	}
	public double sum(double m, double n) {
		return m + n;
	}
}
