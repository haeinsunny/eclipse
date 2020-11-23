package co.sunny.constructTest;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        ChildClass cd = new ChildClass("홍길동","홍길자"); //내가 전달해준 부모이름
//        cd.name = "홍길자"; //내 이름
//        cd.getInfo();
//        System.out.println(cd.name);
          cd.getParentName();
	}

}
