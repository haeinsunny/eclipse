package co.sunny.singletonclass;

import co.sunny.employee.Employee;

public class MainApp {

	public static void main(String[] args) {
		SingletonTest s1 = SingletonTest.getInstance(); //본인 싱글톤클래스에서 new 키워드로 주소뜨도록설정해놨음
		System.out.println(s1);
		
		SingletonTest s2 = SingletonTest.getInstance(); //싱글톤은 객체가 하나만 생긴다. 주소가 하나임. 재사용.
		System.out.println(s2);
		
		Employee em = new Employee();  //일반클래스들은 new키워드로 가져와야함.
		System.out.println("1번" + em);
		
		Employee em1 = new Employee(); // 객체마다 주소가 다름.
//		System.out.println(em1);
		
		em = new Employee(); //출력되고나서 em을 다시 초기화하는것
//		System.out.println("2번" + em);
		
		em = new Employee(); //초기화 할때마다 공간을 다시 생성한다.
//		System.out.println("3번" + em);
		
		Member mb = new Member("KIM", "1234", "HAEIN", "010-1234-5678", "DAEGU", 26);
	    mb.toString(); //생성자를 통해서 변수변경 가능
//	    mb.addr = "부산광역시";
//	    mb.toString();
	    
	    Member mem = new Member();
//	    mem.setId("KIM"); //값을 담아줌
//	    mem.toString(); // setter를 통해서 변수변경 가능
//	    System.out.println(mem.getId());
	    
	    mem.setId("KIM");
	    mem.setPassword("1234");
	    mem.setName("HAEIN");
	    mem.setAddr("DAEGU");
	    mem.setTel("010-1234-5678");
	    mem.setAge(26);
	    mem.toString();
	   
	 
	}

}
