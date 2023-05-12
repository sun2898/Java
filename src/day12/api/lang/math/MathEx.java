package day12.api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
		int ran = (int)(Math.random() * 10) + 1; // 1~10
		
		//Math.abs() - 절대값 구하는 기능
		double d = Math.abs(-3.14);
		System.out.println(d); // 3.14 
		
		//Math.ceil() - 올림
		double d2 = Math.ceil(3.14);
		System.out.println(d2); // 4.0
		
		//Math.floor() - 내림
		double d3 = Math.floor(3.14);
		System.out.println(d3); // 3.0
		
		//Math.round() - 반올림
		double d4 = Math.round(3.14);
		System.out.println(d4 ); //4.0
		
		//Math.max() - 큰 수 반환
		int d5 = Math.max(3, 5);
		System.out.println(d5); // 5
		
	}
}
