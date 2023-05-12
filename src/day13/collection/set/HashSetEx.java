package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		
//		HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add() - 값 추가
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); // 중복 불가
		
		System.out.println(set.toString()); //[spring, database, python, java, jsp]
		
		set.remove("python");
		
		System.out.println(set.toString()); //[spring, database, java, jsp]
		
		//순회 내부적으로
		for(String s : set) {
			System.out.println(s);
		}

		System.out.println("----------------------------------------");
		
		//set => iterator 타입으로 변경 / Iterator란 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { //hasNext() >> 다음값이 있는지 없는지 확인하는 기능. 있으면 true, 없으면 false
			System.out.println(iter.next());
		}
		
	}
}
