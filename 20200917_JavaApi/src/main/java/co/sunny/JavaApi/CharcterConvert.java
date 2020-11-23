package co.sunny.JavaApi;

import java.util.Scanner;

public class CharcterConvert {
	public void Convert01() {
		Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
		String org = sc.next();
    	
		String org1 = org.toLowerCase();
		String org2 = org.toUpperCase();
		
		if(org == org1) {
		   
		    System.out.println("입력한 값은 [" + org1 + "]입니다.");
		}else {
    	 
		    System.out.println("입력한 값은 [" + org2 + "]입니다.");
		}
    		
	}
	
    public void Convert02() {
    Scanner sc = new Scanner(System.in);
    System.out.println(",로 구분하여 입력하세요.");
    

    String str = sc.next();
    String[] names = str.split(",|,|,");
    
    for(String name : names)	
        System.out.println(name);
    }

  
   }
    

