package co.sunny.selectionsort;

public class SelectionSortOrg {
	private int temp; //swap을 위한 임시변수

	
	public void selectionSort(int[] n) {
		for(int i = 0; i< n.length; i++) {
			for(int j = i+1; j < n.length;j++) {
				if(n[i] > n[j]) {  //ascending sort: 작은수에서 큰 수로 정렬
					temp = n[i];
				    n[i]=n[j];
					n[j] = temp;
			}
			
		}
	}
		toString(n); //출력메소드 호출. 자동으로 밑에 메소드 생성하기

}
	public void newSelectSort(int[] n) {
		int min; //가장 작은위치의 인덱스
		for(int i = 0; i < n.length; i++) {
			min = i; //i위치가 가장 작다고 설정해줌
			for(int j = i+1; j < n.length; j++){
				if(n[min] > n[j]) min = j; //min[i]가 j보다 크면 j의 포지션에 넣어라
			} //끝나고나면
			if(min != i) {
				temp = n[i];
				n[i] = n[min];
				n[min] = temp;
				
			}
		}
		toString(n); //출력메소드 호출
	}
    public void rankAlgorithm(int[] n) { //검색알고리즘
    	int[] rank = { 1, 1, 1, 1, 1, 1 };
    	for(int i = 0; i < n.length; i++) {
    		for(int j = i + 1; j < n.length; j++) {
    			if(n[i] > n[j]) {
    				rank[j]++;
    			}else if( n[i] < n[j]) { //반대의 값을 해주는 이유: 동점자 값을 위해서
    				rank[i]++;
    			}
    		}
    	}
    	toString(rank);
    }
     

	private void toString(int[] n) {  //바깥에서 selectionSort만 호출하면 값이 출력되도록
		for (int i = 0; i < n.length; i++) { //i를 출력시킴
			System.out.print(n[i] + " ");  //배열로 출력. ln은 한줄띄어쓰기
			
		}
		
	}
}
