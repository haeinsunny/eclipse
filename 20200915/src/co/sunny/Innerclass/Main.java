package co.sunny.Innerclass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int m;
//		int n;
		
//		while(true) {
//			System.out.println("정수 두개를 넣어주세요.");
//			m = sc.nextInt();
//			n = sc.nextInt();
//	     try{
//			System.out.println("두수의 나눗셈 결과 =" + m/n); //서비스가 중단되지않고 지속되게 한다.
					
//		}catch(Exception e) { 
//			System.out.println("0으로 나눌수 없습니다."); //try-catch 구문을 써서 사용자에게 이 예외구문이 뜨게 한다.
//			e.printStackTrace(); //개발할때는 위아래 둘 중 얘만 열어놓고 사용
			
//		}finally {  //db연결을하고 사용하고나서 연결을 끊어버릴때 사용한다. 계속 연결시켜놓으면 구동이 무겁기때문에 여러사람들의 연결을 자유롭게 하기위해서.  
//			sc.close(); //finally는 항상 수행하기 때문에 sc를 닫아버리는 또다른 예외를 발생시킨다.
			
		ExceptionTest et = new ExceptionTest();
              try {
				et.exPrint();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	    }


	  }
		
	}
	
	//sc.close();
}


