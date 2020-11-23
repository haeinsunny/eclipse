/*
 * 변수 정의 및 범위 연습
 * 2020.09.03 자바수업
 */
package co.sunny;

public class Exam01 {
	int sum;   //변수정의
	

	public void test() {
		int num = 10;  //변수 정의 후 초기화
		sum = 0;  //초기화
		sum = sum + num;
		System.out.println("결과는 : " + sum);
	}
    public void test1() {
        int num = 20; 
    	System.out.println(sum + num);
    }
}
