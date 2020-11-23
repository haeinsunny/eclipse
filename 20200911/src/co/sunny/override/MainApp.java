package co.sunny.override;

public class MainApp { 
	public static void main(String[] args) {
		Animal cat = new Cat(); //상속받은개념을 cat으로 초기화
		cat.animalSound();
		cat.run();
		
		Animal dog = new Dog(); 
		dog.animalSound();
		dog.run();
		
		Animal bird = new Bird();
		bird.run();
		bird. animalSound();
		bird.eat();
		
		Mouse mo = new Mouse(); //상위클래스를 초기화하지않고 본인을 객체생성 & 초기화하여 사용해도됨.(추상화했기떄문에)
		mo.run();
		mo.animalSound();
		mo.eat();
		mo.eat();
		
	    Animal mo1 = new Mouse(); //원래처럼 상위클래스의 객체생성및 초기화하여 해도됨
	    mo1.run();
	    mo1.animalSound();
		
	}

}
