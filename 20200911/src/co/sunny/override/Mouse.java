package co.sunny.override;

public class Mouse extends Animal {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("생쥐는 기어다닌다.");

	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
        System.out.println("찍~~~~찍");
	}

}
