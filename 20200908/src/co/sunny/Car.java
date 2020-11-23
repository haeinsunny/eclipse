package co.sunny;

public class Car {
	public String color;
	String engine; //접근지시자가 디폴트(protected)로 지정됨
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		String speed = "250Km";
		System.out.println(speed + "달리고있다.");
	}
	
	protected void stop() {
		// TODO Auto-generated method stub
        System.out.println("달림을 멈춥니다.");
	}

}
