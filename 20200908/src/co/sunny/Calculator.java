package co.sunny;

public class Calculator {
    private int result; //멤버변수

    public Calculator() {
	//클래스 네임을 그대로 가져오는것이 기본생성자. 지정하지않으면 jvm이 자동생성함.
   }

    public int sum(int n, int m) {  //(전달받을 인자) 예를들어 sum(10, 20);이라는값을 받아올때
	result = n + m;
	return result;  // return n+m; 두줄을 이렇게 합쳐도됨. 
   }
    
    public int sub(int n, int m) { //정수 두개 받아와서 연산처리해서 돌려준다.
    	return n - m;
   }
    
    public void mul(int n, int m) {  //돌려줄값 지정안해도됨. 출력만지정
    	 System.out.println(n*m);
    	 
    	 float divResult = div(n, m);//밑의 나눗셈은 다른클래스에서 못쓰니 같은인자를 받아온 여기서 실행되도록 한다.
    	 System.out.println("두수의 나눗셈 결과= " + divResult);
   }
     
    private float div(int n, int m) { //내 클래스 안에서만 작동하고(캡슐화 정보은닉, 실수 연산해달라. 
    	 return (float) n /m;
   }

}
