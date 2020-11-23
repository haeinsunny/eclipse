/*
 * 
 */
package co.sunny.ex01;

public class Operrator {
    // 멤버변수 선언
	// 멤버메소드 () 구현
	
	public void cal() { //접근지시자
		int num1 = 100;
		int num2 = 50;
		
		int sum, sub;
		
		 sum = num1 + num2 ;
		 sub = num1 - num2 ;
		 int mul = num1 * num2 ;
		 int div = num1 / num2 ;
		 
		 System.out.println("덧셈의 결과 : " + sum);
		 System.out.println("뺄셈의 결과 : " + sub);
		 System.out.println("곱셈의 결과 : " + mul);
		 System.out.println("나눗셈의 결과: " + div);
	}

	public void calf() { //실수연산
		float funm = 10;
		double dnum = 11.3;
		
		double sum = funm + dnum;
		double sub = funm - dnum;
		double mul = funm * dnum;
		double div = funm / dnum;
		
		System.out.println("==실수연산 결과==");
		System.out.println("덧셈의 결과 : " + sum);
		System.out.println("뺄셈의 결과 : " + sub);
		System.out.println("곱셈의 결과 : " + mul);
		System.out.println("나눗셈의 결과 : " + div);
		
	}
	
	public void strCal() {  //String객체 활용하기
		String name;
		String address;
		String tel = "010-0000-0000";
		
		name = "홍길동";
		address = "대구광역시 중구 달구벌대로 222";
		
		System.out.println(name);
		System.out.println(tel);
		System.out.println(address);
		
		
	}
        
	public void boolAndCondition() {
		//boolean b;

		int num = 10 ;
		int num1 = 5 ;
        int min = (num < num1)? num : num1;		
        char grade = (num >= 10)? 'A' : 'f';
        String pass = (num >= 60)? "pass" : "fail";

        System.out.println("reult : " + min);
        System.out.println("grade : " + grade);
        System.out.println("pass: " + pass);
		
	}

	public void ifCondition() { //단순if
	    int num = 77; //메모리 초기화 과정
//		char grade = 'f';
//		if(num >= 70) grade = 'p';
	    String grade;
	    String gender;
	    
	    
	    
	    if(num >= 70) {
	    	grade = "pass";
	    }else {
	    	grade = "fail";
	    }
	    
	    gender = "woman";
//	    gender = "man";
	    		
	    if(gender == "woman") {
	    	System.out.println("쿠폰 1매 증정");
	    	System.out.println("8% 할인율 적용");
	    	System.out.println("멤버십 포인트 적립");
	    }
	    	
	        System.out.println("grade : " + grade);
		
	}
}

