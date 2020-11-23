package co.sunny.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainApp {

	private static List<Student> list =
			Arrays.asList(new Student("홍길동", 100, 100), 
					new Student("박승리", 90, 90));

	public static void main(String[] args) {
          System.out.println("학생이름");
          printString(t->t.getName());  //t타입이 가지고있는 getname을 불러온다
		
	
		}

	public static void printString(Function<Student, String> function) {
		for (Student stu : list) {
			System.out.println(function.apply(stu));

		}

	}
}
