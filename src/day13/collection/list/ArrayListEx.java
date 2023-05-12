package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList (Vector와 거의 동일하지만 보다 더 안정적이다.
		 * -> 배열기반
		 * -> 순서 O, 중복 O
		 */
		
//		ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		//add() - list추가
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍기도");
		list.add("신사임당");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//size() - 길이확인
		System.out.println("리스트의 길이: " + list.size());
		
		//add() - 중간에 추가
		list.add(0, "0번째 추가");
		System.out.println(list.toString());
		
		//get() - 값의 확인
		String n = list.get(3);
		System.out.println(n);
		
		//set() - 값의 수정
		list.set(4, "홍순자");
		System.out.println(list.toString());
		
		//remove() - 값의 제거
		list.remove(0); // index로 찾아서 지움
		list.remove("신사임당"); // 값으로 찾아서 지움
		
		//contains() - 값의 여부
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		}
		
		//isEmpty() - 빈 리스트의 확인
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		} else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		//clear() - 전부 삭제
		list.clear();
		System.out.println(list.toString());
		
		System.out.println("-----------------------------");
		
		//제네릭<?> => 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> => String과 String의 자식들
		//제네릭<? super String> => String타입이 될 수 있다면 전달 가능
		
		List<String> list2 = Arrays.asList("a", "b", "c", "d");	
		System.out.println(list2.toString());
		
		//리스트를 병합
		list.addAll(list2);
		System.out.println(list2.toString());
		
	}

}
