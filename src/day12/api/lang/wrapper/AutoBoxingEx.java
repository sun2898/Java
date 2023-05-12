package day12.api.lang.wrapper;

public class AutoBoxingEx {

	public static void main(String[] args) {
		
		//Autoboxing : 기본타입 > 클래스형 간의 자동 형변환

		Integer val1 = 100;
		int b1 = val1;
		
		Double val2 = 3.14;
		double b2 = val2;
	
		//Wrapper 클래스의 특별한 기능들
		//형변환
		int result1 = Integer.parseInt("34");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		
		System.out.println(result1 + result2 + result3);
		
		System.out.println(Integer.compare(3, 5)); // -1
		// 앞에 값이 뒤 값보다 작으면 -1, 같으면 0, 크면 1
		
	}
}
