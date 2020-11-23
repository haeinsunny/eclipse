package co.sunny.ex01;

public class Gugudan {
	
	public void run() {
		
        for(int i = 2 ; i <= 9 ; i++) {
		    System.out.println("=== " + i + "단" + " ===");
		    
		    for(int j = 1; j <= 9 ; j++) {
		    	System.out.println(i + " * " + j + " = " + (i*j));
		    } //맨 안쪽의 루프를 다 돌면 바깥쪽 루트로 돌아가서 바깥값을 처리한다. 결과 도출될때까 다시 안쪽으로 반복 
        }
	}
}
