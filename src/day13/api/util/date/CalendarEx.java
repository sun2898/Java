package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); // abstract 타입이라 객체 생성 불가능
		
		//static메소드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
		System.out.println(Calendar.YEAR);
		
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1); //월은 1 작게 나옴 
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); // 일
		
		int hour = cal.get(Calendar.HOUR);    // 시
		int min = cal.get(Calendar.MINUTE);	  // 분
		int second = cal.get(Calendar.SECOND);// 초
		
		 System.out.println(hour +"시 " + min + "분 " + second + "초");
		
		
	}
}
