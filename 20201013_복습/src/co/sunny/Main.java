package co.sunny;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Main {

	public class Person { // 클래스
		String name;
		int age;
		String gender;

		public String showMyInfo() { // 메소드
			return this.name + this.age + this.gender;
		}

	}

	public static void main(String[] args) {   //대문자는 클래스 나머지(패키지, 인스턴스 등)는 소문자
		
		String name = "Hong";
		int age = 25;
		int ageOfBrother = 10; 
		
		String v1 = "Hello";
		
	
//		String myName = "Kim";  //이름, 성별, 나이, 피부색 사람마다 하나하나쓰면 헷갈리고 다양성을 담을수없음  > 위에 클래스로 선언하자
		
		Person p1 = new Person();
		p1.name = "Kildong";
		p1.age = 25;
		p1.gender = "male";
		System.out.println(p1.showMyInfo());
		
	
		
		Person p2 = new Person();
		p2.name = "Kildong";
		p2.age = 25;
		p2.gender = "male";
		System.out.println(p2.showMyInfo());
		


		int[] intAry = {1,2,3,4,5,6,7};   //숫자열을 담을수있는 배열
		String[] strAry = {"hello"};
				Person[] pAry = {p1, p2, };
				
		for(int i=0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		for(String str: strAry) {
			System.out.println(str);
		}
		pAry[1] = null;
		for(Person person : pAry) {
			if(person != null)  //null값을 제외하고 출력하기위해
			System.out.println(person.showMyInfo());
		}
List<Person> person = new ArrayList<>();  //담을수있는 Person이라는 컬렉션을 만들겠다 
person.add(p1);    //person에 p1을 담겠다
person.add(p2);
person.add(new person());
person.remove(1);

for(Person p : person) {
	System.out.println(p.showMyInfo());
}
ObservableList<ch.makery.address.model.Person> list = FXCollections.observableArrayList();
list.add(new ch.makery.address.model.Person());

for(ch.makery.address.model.Person p :list) {
	System.out.println(p.getStreet());
}
	}

	public static void getInfo(Person p1) { // ()에 메소드를 담을수있다
		System.out.println("이름은:" + p1.name + "나이는: " + p1.age);
	}

}
