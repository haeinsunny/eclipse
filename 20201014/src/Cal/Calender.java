package Cal;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
//
//		showCal(2020, 7);
//	}
//	
//		public void showCal
		Calendar cal = Calendar.getInstance();  //오늘날짜. 실행하는 시점의 년월일시간이 나옴
		System.out.print("현재: " + cal.get(Calendar.MONTH ) + "월 ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "일 "); // calendar.보고싶은필드

        cal.set(2020, 9, 1);   //2020년 10월 1일     (1월을 0으로 계산함)
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);
        
		cal.set(2020, 10, 0);  //2020년 10월 마지막일    (11월 1일보다 하루전날)
		int lastDate = cal.get(Calendar.DATE);
		
//		System.out.print("요일:" + cal.get(Calendar.DAY_OF_WEEK));
		// 1: 일요일, 2: 월요일, 3: 화요일 ... 7: 토요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.print(week[cal.get(Calendar.DAY_OF_WEEK) -1 ] + "요일");    //10월 1일의 요일정보
		System.out.println(" ");
		System.out.println("=========" + cal.get(Calendar.MONTH) + "월 의 달력" + "==========");
		String[] days = { " Sun", " Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for(String day : days) {
			System.out.print(day + " ");
		}
		System.out.println(" ");
		for(int i = 0; i< firstDay; i++) {
			System.out.printf("%4s", " ");
		}
			
		//달력(1ㅇ리의 요일, 해당월의 마지막 날짜)
		for(int i=0; i < lastDate ; i++) {
			System.out.printf("%4d", (i+1));  //"%3d": 한자리가 차지하는 칸수 (3자리씩 차지)
			if(i % 7 == 6)
				System.out.println();
		}
	}

}
