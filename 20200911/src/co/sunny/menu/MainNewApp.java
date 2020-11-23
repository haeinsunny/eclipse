package co.sunny.menu;

public class MainNewApp {
	
 public static void main(String[] args) {
	 NewChild nc= new NewChild(); //1번 최상위 객체
	 nc.menu();
	 System.out.println("==========");
	  
	 MenuClass mc = new MenuClass(); //1번으로부터 메뉴 상속받음
	 mc.menu(); //1번이 가지고있는 메뉴
	 mc.newMenu(); //내가 만든 메뉴
	 System.out.println("==========");
	 
	 OpenMenu om = new OpenMenu();//2번으로부터 메뉴, 신메뉴 상속받음 
	 om.menu(); //1번이 가지고있는 메뉴
	 om.newMenu(); //2번이 가지고있는 메뉴
	 
	 
	
}
}
