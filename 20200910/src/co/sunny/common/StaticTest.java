package co.sunny.common;

import co.sunny.java.Cal;

public class StaticTest {
	private String name;
	private String gender;
	private String position;
	
	public void getEmployeeInfo() {
		name = "박승리";
		gender = "여자";
		position = "정규직";
		
		System.out.println(name + " " + gender + " " + position);
	}
	
	public void setSave(int money) {
		Cal.amount += money;
		System.out.println(Cal.amount);
	}
	
	public void getMoney(int money) {
		Cal.amount -= money;
		System.out.println(Cal.amount);
	}

}


