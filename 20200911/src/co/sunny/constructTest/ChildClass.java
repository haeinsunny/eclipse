package co.sunny.constructTest;

public class ChildClass extends ParentClass{ //상속관계 연결

	private String name;
	
	public ChildClass(String name, String cName) { //부모이름을 상위로 전달할때
		super(name); //나를 나타낼때 상위클래스에 전달하며 생성해달라 (상위호출). 아빠이름
		this.name = cName; //나의 이름

	}
	
	public void getInfo() {
		super.getInfo(); //부모 정보를 쓰겠다 (상위의 메소드명도 똑같을때 쓸수있음). super를 쓰면 상위의 getInfo와 메소드명이 같아도 상위의 getInfof와 구분해서 인식하여 값을 가져옴
		System.out.println(" 나는 자식 Class ");
	}
	
	public void getParentName() {
		System.out.println(super.name); //아빠이름
		System.out.println(name); //내이름
	}
}
