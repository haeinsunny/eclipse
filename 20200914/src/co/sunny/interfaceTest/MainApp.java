package co.sunny.interfaceTest;

public class MainApp {

	public static void main(String[] args) {
	TV tv = new SamsungTv(); //인터페이스도 본인스스로 객체 생성불가능
	tv.on();
	
	SamsungTv stv = new SamsungTv();
	stv.speaker(); //삼성티비가 가진 고유의 기능을 쓰려면 삼성티비를 초기화 시켜주면됨
	
	tv = new LGTv(); //tv라는객체에 엘지 티비가 들어왔다고만 인식해주면됨- 인터페이스의 존재이유
	tv.on();
   
	InterfaceTestA ia = new ImplementClass();
	ia.funcA();
	
	InterfaceTestB ib = new ImplementClass();
	ib.funcB();
	}

}
