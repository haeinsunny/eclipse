package co.sunny;

import java.util.Random;

public class ArrayTest {
	public int[] arr = new int[5];  //public 다른 클래스에서 사용가능. 변수가 메소드 밖에 있으면 모두 적용 가능.(클래스 변수이기 때문에)
	
	public void intArrayTest() {    
		int[] arr1 =new int [5];    //이 변수는 해당 메소드 안에서만 인식 가능  //배열객체 선언, new초기화
		arr1[0] = 100;      //배열 요소값 변화
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
	}
	
   public void forArrayTest() {  //for문을 이용해보자
       int[] arr1 = {10,20,30,40,50};   //배열을 선언함과 동시에 초기화를 동시에 하는것.
       System.out.println("배열길이는 = " + arr1.length);
       
       for(int i=0 ; i < arr1.length ; i++) {  //length는 5를 뜻함 (10~50까지의 5개)
	       System.out.println(arr1[i]);
      }
   }
   
   public void forInitArray() { 
	   int[] arr1 = new int [100];
	   for(int i = 0, j = 100 ; i < arr1.length ; i++, j--) { //for(초기값 i에는 0을, j는 100을 둔다 ; 조건 ; i는 1씩 증가, j는 1씩 감소) ,로 구분하면 구분된 모든것을 수행한다 
		   arr1[i] = j;  
	   }//배열에 초기화
	   
	   for(int i = 0 ; i < arr1.length ; i++) {  
		   System.out.println("arr[ " + i + " ] = " + arr1[i]);
	   }//배열요소값 출력
    }
   
   public void randomInitArray() {
	   Random random = new Random(); //난수를 발생한다.
	   int[] arr1 = new int[5];
	   
	   for(int i = 0 ; i < arr1.length ; i++) {
		   arr1[i] = random.nextInt(5) +1 ;  //0~5사이의 숫자를 생성시켜줌. 중복 발생 가능
	   }
	   
	   for(int i = 0 ; i < arr1.length ; i++) {
		   System.out.println("arr1[" + i + "] = " + arr1[i]);
	   }
	   
	}
   
}
