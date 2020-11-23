package co.sunny.constructTest;

public class ParentClass {

	public String name;
	
	public ParentClass(String name) { //자식으로부터 받아오는 이름
        this.name = name;
		
	}
	
	public void getInfo() {
		System.out.println(name);
		System.out.println(" 나는 상위 Class ");
	
	}
}
