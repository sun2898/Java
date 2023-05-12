
 package day12.api.String;

public class MainClass {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c'};
		
		String str = "안녕하세요";
			
		System.out.println(str.indexOf("안녕"));
		System.out.println(str.indexOf("xx"));
		
		System.out.println(str.lastIndexOf("안녕"));
		
		//길이
		if(str.contains("안녕")) {
			System.out.println("문자에 값이 존재함");
		}
		
		System.out.println("=================================================");
		
		String str1 = "자바의 기원은, 자바칩프라푸치노 커피집에서 시작되었따.";
		
		System.out.println(str1.replace("자바","java"));
		System.out.println(str1.replaceFirst("자바", "java"));
		System.out.println(str1.replace(" ", ""));
		
		//문자열 자르기
		System.out.println(str.substring(9));
		System.out.println(str.substring(9, 17)); 
	}
}
		