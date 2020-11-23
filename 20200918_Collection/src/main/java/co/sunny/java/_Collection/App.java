package co.sunny.java._Collection;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("홍길동");
//		list.add("박기자");
//		String str = list.get(0);
//		String str2 = list.get(1);
		
//		System.out.println(list);
//		System.out.println(str);
//		System.out.println(str2);
//		list.set(0, "홍길순"); //set: 값을 집어넣겠다. 이름 변경할때
//		list.add("박승리"); //이미 만들어진 리스트(스트링구조)에 추가할때. 리스트(배열구조)는 ...
	
//		for(String str : list) {
//			System.out.println(str);
//      ------------------------------------			
		Member member;
		List<Member> list = new ArrayList<Member>();
		member = new Member("hong", "홍길동", 18, 200, 10); //한 사람의 데이터를 
		list.add(member); //입력하겠다
		
		member = new Member(); //새로운 멤버객체를 생성해서
		member.setId("park");  //사원을 입력한다
		member.setName("박승리");
		member.setAge(20);
		member.setSalary(200);
		member.setTax(10);
		list.add(member); //list에 이 member를 집어넣어라.

		
		for(Member vo :list) {  //멤버타입의 vo를 list타입으로 출력하겠다.
			System.out.print(vo.getId() + " ");
			System.out.print(vo.getName() + " ");
			System.out.print(vo.getAge() + " ");
			System.out.print(vo.getSalary() + " ");
			System.out.println(vo.getTax() + " "); //줄바꿈할때 마지막에만 ln
			
		}
		}
	}
	

