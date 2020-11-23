package co.sunny.java.map;

public class App {

	public static void main(String[] args) {
		BoxOne box = new BoxOne();
		
        box.setOject("String Class");
//        String name = box.getObject(); //구체적으로 캐스팅 해줘야함
        String name = (String)box.getObject();  //캐스팅한것
        System.out.println(box.getObject()); //.을 하는이유?
        System.out.println(name);
        box.setOject(1); //
        int i = (int) box.getObject(); //add cast해주기
        System.out.println(i);
	
	    BoxTwo<String> bt = new BoxTwo<String>(); //이미 string타입이라는걸 지정해줌
        bt.setT("String 값을 입력한다.");	
        String str = bt.getT();
        System.out.println(str);
        
//        BoxTwo<int> bt = new BoxTwo<int>();  //int를 쓰면 안먹음. 객체를 써야함
        BoxTwo<Integer> bt1 = new BoxTwo<Integer>(); 
        bt1.setT(2);
        int j = bt1.getT(); //캐스팅하지않고 값을 받아옴
        System.out.println(j);
	}

}
