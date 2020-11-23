package co.sunny.JavaApi;

import java.util.StringTokenizer;

//import java.sql.Date;

public class App {

	public static void main(String[] args) {
//		Date date;
//		System.out.println("Hello World");
//		long time = System.currentTimeMillis();
//		long time2 = System.nanoTime();
//		
//		System.out.println(time);
//		System.out.println(time2);
//		date = new Date(time);  //sql(년.월.일), util(년.월.일.시.분.초)
	
//		System.out.println(date.toString());  //현재 시스템의 날짜를 출력해달라
//		--------------------------
//		String str = " rlAgodls dlqslek";
//		str.toString();  //string객체는 주소가 아닌 값자체를 넘긴다.
//		System.out.println(str); //str만 써도 값이 출력됨.
		
//		System.out.println(str.charAt(3)); //string객체는 기본적으로 byte배열이라서 3번째 텍스트를 출력해준다.
//		System.out.println(str.toUpperCase()); //내가 갖고있는 문자열을 대문자로 바꿔줌.
//		System.out.println(str.codePointAt(8)); //아스킷코드로 보여준다.
//		System.out.println(str.trim()); // 앞쪽의 공백을 없애준다. (Ltrim, Rtrim, Trim)
//       System.out.println(str.replaceFirst("A", "BB"));	
//       System.out.println(str.substring(4)); //4번째 문자열까지 삭제하고 출력
//       System.out.println(str.substring(1, 5)); //1부터 5까지의 문자출력
//      System.out.println(str.concat("ABC")); //문자열 뒤에 지정한 문자열을 더해준다
//        System.out.println(str.equals("ABC")); //지정한 문자열과 str이 같은지 T or F를 출력한다.
//        String id = "Hong";
//        System.out.println(id.equals("Hong".toUpperCase())); //id == "Hong"일때 true를 출력한다.
//       String id = "HONG";
//        System.out.println(id.equals("Hong".toUpperCase())); //지정값을 대문자로 변환한값과 str이 같은지 출력
//        ------------------------------
        String str ="홍길동 &김기자 , 이기자 -최승리";
        String[] name = str.split("&|, |-"); //문자열만 보고싶을때 |로 구분해서 기호값을 제외하고 문자열만 보여준디.
        for(String st : name) {
        	System.out.print(st);
//      ---------------------------------        
        	
        	
//       StringTokenizer st = new StringTokenizer(str, "</br>");
       
//       while 
        }
        
        
	}
	
}
