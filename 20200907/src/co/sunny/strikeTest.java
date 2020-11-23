package co.sunny;
  import java.util.Random;
  import java.util.Scanner;

public class strikeTest {
	private int[] resultNum = new int[3];
	
	private void initGameNum() {
		Random rd = new Random();
		
		for(int i = 0; i < resultNum.length; i++) {
			resultNum[i] = rd.nextInt(10);
			for(int j = i; j < i; j++) {
				if(resultNum[j] == resultNum[i]) {
					i--;
					break;
				}
		  }
	}
		System.out.println("정답: " + resultNum[0] + resultNum[1] + resultNum[2]);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean finish = true;
		int[] gameNum = new int[3];
		initGameNum(); //정답생성
		
		while(finish) {
			int strike = 0, ball = 0;
			System.out.println("0~9 까지의 숫자 3개를 입력하세요.");
			for(int i=0; i<3; i++) {
				gameNum[i] = sc.nextInt();
				for(int j=0; j<3; j++) {
					if(gameNum[i] == resultNum[j]) {
						if(i == j ) strike ++;
						else ball++;
						
					}
				}	
			}
			System.out.println(strike + " 스트라이크" + ball + " 볼");
			if(strike == 3) {
			  finish = false;
			  System.out.println("정답.");
			}
		}
		sc.close();
	}
		
}