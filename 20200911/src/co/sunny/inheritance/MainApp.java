package co.sunny.inheritance;

public class MainApp {

	public static void main(String[] args) {
	    Parent pa = new Parent();
//		pa.getInfo();
		
		Child ch = new Child(); //상속받은 Class
//		ch.getInfo(); //getInfo메소드는 부모만 갖고있으므로 부모 메소드를 출력
//		ch.cgetInfo();
		System.out.println(ch.name);
//		System.out.println(ch.cname);
				

	}

}
