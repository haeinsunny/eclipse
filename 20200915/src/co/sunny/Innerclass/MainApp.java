package co.sunny.Innerclass;

//import co.sunny.Innerclass.OuterClass.StaticInnerClass;

public class MainApp {

	public static void main(String[] args) {
//		OuterClass outer = new OuterClass();
//		OuterClass.InnerClass oi= outer.new InnerClass();
//		oi.outString();
		
//		OuterClass.StaticInnerClass c = new StaticInnerClass();
//		c.strPrint();
		
//		int i = 10;
//		System.out.println(i/0); //런타임 오류
//      int r = 0;
//      System.out.println(r/0);
        
//       try {
//        	System.out.println(i/r);
//       	
//        }catch(Exception e) {
//        	e.printStackTrace();
//        	System.out.println("특정한 수를 0으로 나눌려고 했다."); //r에 0을 넣는경우 이 메세지 뜸
//        }
//        while(true) {
//        	System.out.println(i/r);
//        }
//       while(true) {
//       	 try {
//             	System.out.println(i/r);
            	
//             }catch(Exception e) {
//             	e.printStackTrace();
//             	System.out.println("특정한 수를 0으로 나눌려고 했다."); 
//             }
		ExceptionTest et = new ExceptionTest();
		try {
			et.exPrint();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
        
	}


