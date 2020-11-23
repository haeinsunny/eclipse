package co.sunny.sort;

import co.sunny.selectionsort.RandomArray;
import co.sunny.selectionsort.SelectionSortOrg;

public class App {

	public static void main(String[] args) {
		int[] num = {5,7,9,3,1,4}; //초기값을 준다.
		SelectionSortOrg sS = new SelectionSortOrg();
//		sS.selectionSort(num);
//		for(int i= 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		} //위에서 이미 sort된 값이 내려오기 때문에 닫아주기. 
		  //call by address(배열은 주소를 주고받아서 비교함), call by value(값 자체를 주고받는것), call by reference(자바에선 잘 안일어남)

//		sS.newSelectSort(num);
		
//		sS.rankAlgorithm(num);
	    
		RandomArray ra = new RandomArray(5);
		num = ra.randNum();
        sS.newselectSort();
		Arrays.sort(num);
		for(int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
}
