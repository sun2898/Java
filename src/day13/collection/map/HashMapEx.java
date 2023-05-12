package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map인터페이스를 구현하는 클래스 HashMap
		//key에 대한 타입과 value에 대한 타입을 지정
		//탐색이 빠르다.
		
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>(); // 보통 이렇게 많이 사용함
		
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		//문자열로 맵의 결과 출력
		System.out.println(map.toString()); // {1=홍길동, 2=이순신, 3=홍길자, 4=홍길동, 5=신사임당}
		System.out.println(map.size());
		
		//맵에 동일한 키를 저장하면? -> 값의 수정이 일어남
		map.put(4, "강감찬");
		System.out.println(map.toString()); // {1=홍길동, 2=이순신, 3=홍길자, 4=강감찬, 5=신사임당}
		
		//맵의 값을 얻기 - get(키)
		String item = map.get(3);
		System.out.println("3번 키에 대한 값: " + item); //3번 키에 대한 값: 홍길자
		
		//key의 유무 확인 containsKey()
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}
		
		//map의 삭제 remove()
		map.remove(4);
		System.out.println(map.toString()); // {1=홍길동, 2=이순신, 3=홍길자, 5=신사임당}
		
		//map의 순회
		
		//방법 1
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		//엔트리에는 키, 값을 꺼내는 기능이 있음
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("---------------------------------------------");
		
		//방법2
		Set<Integer> set = map.keySet();
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("---------------------------------------------");
		
		//맵에 객체를 담는 모형 - 값 자리에 객체를 넣음
//		Map<Integer, 유저> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
		
		
		
		
		
	}
}
