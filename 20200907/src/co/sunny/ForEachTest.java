package co.sunny;

import java.util.Random;

public class ForEachTest {
	public void forEach() {
		Random rd = new Random();
		int[] scores = new int[10];
		int sum = 0;
		
		for(int i = 0; i< scores.length; i++) {
			scores[i] = rd.nextInt(100) +1;
		}
		
		for(int score : scores) {  //for Each구문
			sum += score;
			System.out.println(score);
		}
System.out.println("============");
System.out.println(sum);
	} 
	
	public void strObject() {
		String name = "홍길동";
		System.out.println(name.length());   //요소길이
		System.out.println(name.charAt(2));  //첫번째 요소 (0). 0부터 매겨짐.
		System.out.println(name.charAt(0));  //두번째 요소 (1)
		System.out.println(name.charAt(1));
        System.out.println(name.compareTo("김해인")); //홍길동과 김해인 요소간의 떨어진 거리만큼을 나타냄
        System.out.println(name.equals("김해")); //요소끼리 텍스트가 일치하는지
	}
	
	public void doubleInArrary() {
		int[][] num = new int[2][5];  //2차원 정수형 배열을 선언한다.
		int count = 1;
		for (int i = 0; i < num.length; i++) {  //행 길이 만큼
			for(int j = 0; j < num[i].length; j++) { // 행의 열 길이 만큼
				num[i][j] = count++;
			}
		}
			for (int i = 0; i < num.length; i++) {  //행 길이 만큼
				for(int j = 0; j < num[i].length; j++) { // 행의 열 길이 만큼
					System.out.print(num[i][j] + " ");
				}
				System.out.println();
			}
				
			System.out.println("=============");
			
				for(int score[] : num) {
					for(int n : score) {
						System.out.print(n + " ");
					}
					System.out.println();
				}
				
		}
	public void doubleExam() {
	
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i +1; j++) {
				System.out.print("*");
	      }
	
			System.out.println();
		}
		System.out.println("======");
		
		
		
		for(int i = 1; i < 5; i++) {
			for(int j =4 ;j > 0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}



