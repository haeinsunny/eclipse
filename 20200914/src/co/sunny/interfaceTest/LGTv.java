package co.sunny.interfaceTest;

public class LGTv implements TV {

	@Override
	public void on() {
		System.out.println("LG TV On");

	}

	@Override
	public void off() {
		System.out.println("LG TV Off");

	}

	@Override
	public void channelSelect() {
		System.out.println("터치방식");

	}

	@Override
	public void provide() {
		System.out.println("Maid in LG");

	}

}
