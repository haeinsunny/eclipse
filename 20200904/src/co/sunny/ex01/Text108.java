package co.sunny.ex01;

import java.util.Scanner;

public class Text108 {

	public void IfExample() {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("등급은 B 입니다.");
	}
	public void IfElseExample() {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B 입니다.");
		}
	}
	public void ifElseifCondition() {
		int score = 93;
		if(score >= 90) {
			System.out.println("성적은 A");
		}else if(score >= 80) {
			System.out.println("성적은 B");
		}else if(score >= 70) {
			System.out.println("성적은 C");
		}else if(score >= 60) {
			System.out.println("성적은 D");
		}else {
			System.out.println("성적은 F");
		}
		
	}
    
	public static void switchCase() { //여러개 중에서 하나 선택하는것
		Scanner sc = new Scanner(System.in); // 키보드로부터 입력받는 객체
		System.out.println("점수를 입력하세요");
		int jumsu = sc.nextInt();
		
		switch (jumsu/10) {
		    case 10 :
		    	
		    case 9 :
		    	System.out.println("성적은 A");
		        break;
		    
		    case 8 :
		    	System.out.println("성적은 B");
		        break;
		    
		    case 7 :
		    	System.out.println("성적은 C");
		        break;
		    
		    case 6 :
		    	System.out.println("성적은 D");
		        break;
		        
		    default :
		    	System.out.println("성적은 F");
		    	break;
		}
		sc.close(); //객체를 닫는다
			
	}
}
