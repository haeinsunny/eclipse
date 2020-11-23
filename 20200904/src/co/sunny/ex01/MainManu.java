package co.sunny.ex01;

import java.util.Scanner;

public class MainManu {
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		boolean b = true; //boolean 초기값은 true. 
		
		do {
			System.out.println("1. 학생관리");
		    System.out.println("2. 성적처리");
		    System.out.println("3. 그만하기");
		    System.out.println("=========");
		    System.out.println("원하는 작업번호를 입력하세요.");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			sumenu1();
			break;
			
		case 2 :
			sumenu2();
			break;
			
		case 3 :
		
			b = false;
			System.out.println("시스템을 종료합니다.");
			break;
		}
			
	  }while(b);         //do whiㅣe문 종료
	  
	}
	private void sumenu1() {
		System.out.println("2번 메뉴 선택");
		
	}
    private void sumenu2() {
    	boolean b = true;
    	do{
    		System.out.println("===학생관리===");
    		System.out.println("1. 등록");
    		System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 종료");
            System.out.println("=============");
            System.out.println("수행할 작업을 선택하세요.");
            int num = sc.nextInt();
            switch(num) {
            case 1:
            	System.out.println("새로운 학생을 등록합니다.");
            	break;
            case 2:
            	System.out.println("학생 정보를 수정합니다.");
            	break;
            case 3:
            	System.out.println("학생 정보를 삭제합니다.");
            	break;
            case 4:
            	b = false;
            	System.out.println("메인메뉴로 돌아갑니다.");
            	break;
            }
        
            }while (b);
    	}
    
}
