package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {

	public static void main(String[] args) {
		
		//ABC abc = new ABC();
		
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동");
		String name = abc.getT();
		System.out.println(name);
		
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠내용은 생략가능
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		//제네릭에는 원시타입을 사용할 수 없다.
		// (int - X / Integer - O)

		//멀티제네릭
		DEF<Integer, String> def = new DEF<>();
		
		
	}
}
