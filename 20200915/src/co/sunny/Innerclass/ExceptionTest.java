package co.sunny.Innerclass;

public class ExceptionTest {
	public void exPrint() throws Exception, FileNotFoundException {
		System.out.println("메소드 예외 처리 테스트");
	}
	
    public void exPrint2() {
    	try {
    		System.out.println("메소드내 try 구문으로 처리");
    	}catch (Exception | FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	 et.exPrint2();
    }
}
