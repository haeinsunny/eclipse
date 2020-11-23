package co.sunny.ex01;

public class LoopTest {
	//문법: for(초기값;조건;증감;) {} 이 조건이 참이 될때까지 반복한다.
	
	public void forTest() {
		int sum = 0; //처음에 0을 수행함
		int i;
		for(i=1 ; i<=100 ; i++) { //for안의 차례대로 i가 100이 될때까지를 sum하고 i++한다. 그다음 i가 만족되는지확인을 반복
			if( i > 50 ) {
				break;
			}
			//sum = sum + i;
		}
		
		System.out.println("1~" + (i-1) + "까지의 합 :" + sum);
	}
	public void whileTest() {  //while(조건) {}
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;  //위의 대입연산을 하고나서 1을 증가 시켜라. 최대한 쉽게 풀이
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void whileTest2() {
		boolean b = true;
		int check = 0;
		while(b) {
			System.out.println("무한히도는 Loop");
			if(check >10) {
//				break;  //강제로 멈추는건 컴퓨터가 싫어한다. 자연스럽게 멈추도록 설정
				b = false; //정상적인 비교흐름에서 b값이 멈추도록한다.
			    }
				check ++;
//				continue;  //while(b) 블록안으로 돌아가라
			}
		}
		
	
	public void dowhileTest() {
		int i = 1;
		
		do {
			System.out.println( i + "번째 수행");
			i++; //하나씩 증가하면서 돌아라
		}while(i < 10);  
     }
}
