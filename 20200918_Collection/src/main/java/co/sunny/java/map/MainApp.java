package co.sunny.java.map;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>(); //map안은 객체로 집어넣어야함. <key에 대응, 값에 대응>
		map.put(1, "홍길동");
		map.put(2, "박승리");
		
		System.out.println(map.get(1)); //가지고올땐 get을 써서 key값만 넣어주면된다.
		System.out.println(map.get(2));
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "김치국");
		System.out.println(map1.get("name"));

	}

}
