package co.sunny.Innerclass;

public class OuterClass {
	int num = 100;
	String str1="JAVA";
    String str2 = "Wellcome";
    static String str11 = "JAVA Wellcome";
    
    public OuterClass() {
    	System.out.println("나는 바깥 클래스입니다.");
    	
    }
    
    class InnerClass {  //중첩클래스 생성
    	int num = 10;
    	String str3 = str1;
    
    	public InnerClass() {
    		System.out.println("나는 안 클래스입니다.");
    
    }
    	public void outString() {
    		System.out.println(str3);
    	}
    	
    }
    
    static class StaticInnerClass{
    	//String str4 =  str2; //static클래스에서는 static한 변수들만 사용가능해서 str2사용불가
    	String str4 = str11; //static inner calss는 outclass member를 참조할때 static으로 선언된것만 참조가능하다
    	
    	void strPrint() {
    		System.out.println(str4);
    	}
    }
    
}
