package co.sunny.ex01;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operrator op = new Operrator();
//      op.cal(); //정수연산 메소드. 안하려면 // 이걸로막으면 됨
//      op.calf(); //실수연산 메소드
//      op.strCal(); //문자열 처리
//      op.boolAndCondition();
//      op.ifCondition();
		  
		Text108 tx = new Text108();
//		tx.IfExample();
//		tx.IfElseExample();
//		tx.ifElseifCondition(); //if ~ else if ~
//		tx.switchCase();
		
		LoopTest lt = new LoopTest();
//		lt.forTest();
//		lt.whileTest();
//		lt.whileTest2();
//		lt.dowhileTest();
		
		Gugudan gg = new Gugudan();
//		gg.run();
		
		MainManu mm = new MainManu();
		mm.menu(); //메뉴호출
		
	}


}
