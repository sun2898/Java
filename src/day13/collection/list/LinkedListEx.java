package day13.collection.list;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		/* LinkedList
		 * -> 순서 O, 중복 O
		 * -> 노드객체 (양방향 연결리스트)
		 * 삽입, 삭제는 ArrayList보다 좋으나, 탐색은 느림
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//List와 기능은 동일하다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//문자열로 출력
		System.out.println(list.toString());
		
		// 중간에 값 추가
		list.add(3, 10); // 3번째 인덱스에 10 추가
		System.out.println(list.toString());
		
		//get() - 값 얻기
		int n = list.get(3);
		System.out.println(n);
		
		//remove() - 값 삭제
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("--------------------------------");
		
		//linkedlist는 Queue의 기능을 구현 할 수 있다. 
		
		list.offer(10); // [1, 2, 3, 3, 4, 5, 10]
		list.offer(11); // [1, 2, 3, 3, 4, 5, 10, 11]
		
		System.out.println(list.toString());
		
		int r = list.poll(); 
		System.out.println(r); // 1
		System.out.println(list.toString()); //[2, 3, 3, 4, 5, 10, 11]
		
	}

}
