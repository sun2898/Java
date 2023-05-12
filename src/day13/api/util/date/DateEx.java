package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		
		//1970/1/1 0시 기준으로 millis으로 변경 => 날짜 연산할때 사용, 날짜 타입으로는 불가능
		long millis = date.getTime();
		System.out.println(millis);
		
		//현재시간 + 1초
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date2);
		
		
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis);
		
		System.out.println("---------------------------------");		
		
		//사람이 보기 편한 날짜로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		
		
		
		
	}
}
