package co.sunny.override;

public class Dog extends Animal {
	@Override //오버라이드의 명시적인 표현(오버라이드가 되었다는 확실한 표현)
//	public void run() {
//		System.out.println("강아지는 4발로 달린다."); //명시적인 표현이 없어도 묵시적인 오버라이드 됨
//	}
	
	public void run() {
//		super.run(); //부모의것을 보고싶을때. (부모의것 호출하고)
		System.out.println("강아지는 4발로 달린다."); //명시적인 표현이 없어도 묵시적인 오버라이드 됨. (내것도 호출)
	}
	
	public void animalSound() {
//		super.animalSound();//부모의것 호출하고
		System.out.println("강아지는 멍멍하고 짖는다."); //내것도 호출
	}

}
