package co.sunny;

public class MainApp {

	public static void main(String[]args) {
//		SungJuk sJ = new SungJuk();
//		sJ.toString(); //출력메소드만 입력하면 실행됨

		Calculator Cal = new Calculator(); //Cal이라는 인스턴스 생성
		Calculator myCal = new Calculator(); //myCal이라는 인스턴스 생성
		Cal.mul(2, 8); //n, m의 값 지정해주기. void로 돌려주지 않아도 되므로 출력값만 입력하면 된다.
		
		int result = Cal.sum(10, 20); // int로 돌려준다고 했기때문에 앞에 int를 입력함 
		System.out.println(result);  //Cal객체의 값을 출력한다.
		System.out.println(myCal.sum(20,30));  //myCal객체에 연산한값을 출력한다.
		
		int num = myCal.sub(20, 10);
		System.out.println(result + num); //위의 result를 받아와서 다른연산에 이용할때 
	
	    
	}
}
