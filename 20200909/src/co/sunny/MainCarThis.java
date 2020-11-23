package co.sunny;

public class MainCarThis {

	public static void main(String[] args) {
		CarThis car = new CarThis("SONATA");  //힙에 car영역생성
	    car.toString();
		
	    car = new CarThis("SONATA", "White"); //new키워드로 힙의 car메모리를 초기화시키고 정보입력
	    car.toString();
	    
	    car = new CarThis("SONATA", "Black", "2,000cc");  //new키워드로 같은 car 메모리 이용
        car.toString();
      
	}

}
