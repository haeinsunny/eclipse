/*
 * 싱글톤 클래스예제 순서 1~3번
 * 싱글톤 클래스 인스턴스(객체생성)가 한개만 생기는것을 말함
 */
package co.sunny.singletonclass;

public class SingletonTest {
	
	private static SingletonTest singleton = new SingletonTest(); //1번. 본인 클래스안에서 new키워드로 싱글톤 초기화한다
	
	//사용할 멤버를 정의하면된다.
	private int num;
	private int result;
	
    private SingletonTest() {
    	//2번. 싱글톤 클래스 생성자를 private으로 만든다.
    	System.out.println("나는 싱글톤 Class입니다.");
    }
    
    public static SingletonTest getInstance() { //돌려줄값=클래스명과 같이(static singleton)//3번. getInstance()를 사용해서 자신의 인스턴스를 하나만 돌려준다.
    	
    	return singleton;
    }
    
}
