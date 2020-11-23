package co.sunny.rambda;

public class App {

	public static void main(String[] args) {
		RambdaTest ram = () -> {
			System.out.println("람다표현으로 구현");
			System.out.println("이름");
			System.out.println("람다");
		};

		ram.method();
		System.out.println("===================");
		ram = () -> {System.out.println(1+2);
		};
		ram.method();
        
		
		Rambda li = (str) -> {
			str += " 입니다."; //문자열뒤에 자동으로 입니다를 붙인다.
			
			return str;
		};
		
		String name = li.name("홍길동");
		System.out.println(name);
		
	}

}
