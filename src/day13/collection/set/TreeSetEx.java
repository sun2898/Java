package day13.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//set + 정렬
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(40);
		set.add(200);
		set.add(20);
		set.add(5);
		set.add(34);
		
		System.out.println(set.toString()); //오름차순으로 자동 정렬
		// 결과 : [5, 20, 34, 40, 100, 200]
		
		for(int a : set) { //값 꺼내기(정렬된 상태에서 순차적으로 나옴)
			System.out.println(a);
		}
	}
}
