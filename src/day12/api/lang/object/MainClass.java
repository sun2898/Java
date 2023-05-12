package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		Person p2 = new Person("홍길동");
		
		//객체의 name변수가 같다면 true반환 하도록 오버라이딩
		boolean bool = p.equals(p2);
		System.out.println(bool);
		
		//toString - 주소값을 문자열로 반환해주는 기능
		//toString메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용된다.
		System.out.println(p.toString());
		
		try {
			Person clonePeople = (Person)p.clone();
			
			System.out.println(clonePeople.getName());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int result = p.hashCode();
		System.out.println(result);
		
		PrintStream ps = System.out; //PrintStream은 콘솔창으로 출력하는 기능을 가지고 있다.
		ps.println("출력");
	}
}
