package co.sunny;

public class SungJuk {
	String[] name = {"홍길동", "박승리", "이기자", "김치국"};  //이름 배열
	int[] kor = {100,90,80,100}; //점수 입력
	int[] eng = {90,90,90,100};
	int[] math = {100,90,100,90};
	int[] sum = new int[4]; //총점 들어가는 배열
	double[] avg = new double[4]; //평균 들어가는 배열

    private void setSum() {   //총점 계산
    	for(int i = 0; i < sum.length; i++) {
    		sum[i] = kor[i] + eng[i] + math[i];
    	}
    }
    private void setAvg() {   //평균 계산
    	for(int i = 0; i < sum.length; i++) {
    		avg[i] = sum[i] / 3.0;
    	}
    }
    public String toString() {  //출력을 한다.
    	setSum(); //합계구하는 메소드 실행
    	setAvg(); //평균구하는 메소드 실행
    	
    	System.out.println("==========================");
    	System.out.println("=======학 생 성 적 처 리=======");
    	System.out.println("==========================");
    	System.out.println(" 이름    국어  영어  수학  총점  평균  ");
    	System.out.println("==========================");
    	
    	for(int i = 0; i < name.length; i++) {
    		System.out.print(name[i] + " ");
    		System.out.print(kor[i] + " ");
            System.out.print(eng[i] + " ");
    		System.out.print(math[i] + " ");
    		System.out.print(sum[i] + " ");
    		System.out.println(avg[i] + " ");
        }
    	
    	System.out.println((float) 3/2);
        return null;
    }
}
