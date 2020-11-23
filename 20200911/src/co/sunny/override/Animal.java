package co.sunny.override;

public abstract class Animal {
	public abstract void run(); //추상클래스라고 한다. 메소드내용은 하부객체에서 알아서 정의하여 쓰라는뜻.
	public abstract void animalSound();//동물마다 다르게 가지는내용. 동물마다 각자의 메소드에서 정의해줌
	public void eat() {
		System.out.println("먹는다."); //동물들의 공통적인특성. 하위클래스에서 정의할 필요없다.
	}

}
