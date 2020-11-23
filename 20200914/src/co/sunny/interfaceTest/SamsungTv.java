package co.sunny.interfaceTest;

public class SamsungTv implements TV {//TV인터페이스를 통해서 삼성티비라는 클래스를 만든다.

	@Override
	public void on() {
		System.out.println("삼성 TV On");

	}

	@Override
	public void off() {
		System.out.println("삼성 TV Off");

	}

	@Override
	public void channelSelect() {
		System.out.println("터치방식");

	}

	@Override
	public void provide() {
		System.out.println("Maid in Samsung");

	}
	
	public void speaker() {
		System.out.println("Twin Speaker");
	}

}
