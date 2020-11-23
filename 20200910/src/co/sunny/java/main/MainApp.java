package co.sunny.java.main;

import co.sunny.common.StaticTest;
import co.sunny.employee.Employee;
import co.sunny.java.Cal;

public class MainApp {

	public static void main(String[] args) {
		Employee em = new Employee();
//		em.getEmployeeInfo(); //출력해
		
		
	    Cal c = new Cal();
//	    c.amount = 100;
		
//		System.out.println(Cal.amount); //값을 출력해
//		Cal.amount = 100; //위처럼 객체를 생성하지 않아도 바로 호출 할수있음. static키워드라서 공유ㅇㅇ 
//	    System.out.println(Cal.amount); //또 값을 출력해
	    
		StaticTest st = new StaticTest();
		
//	    em.getEmployeeInfo();
	    st.getEmployeeInfo();
	    em.setSave(10000);
	    em.setSave(200);
	    System.out.println("저축금액");
	    st.getMoney(8000);
//	    Cal.tex = 10; //실행 안된다.
	 
	}


}
