package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Random ran = new Random();

		for(int i = 0; i < 100; i++) {

			list.add(ran.nextInt(100)+1); // 1~100까지
		}

		System.out.println(list.toString());
		
		//최종집계 함수
		//collect()
		
		List<Integer> newList = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());
		System.out.println(newList.toString());
		
		Set<Integer> newList2 = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toSet());
		System.out.println(newList2.toString());
		
		System.out.println("---------------------------------------------------------------------");
		
		//sum(), count(), avg(), max(), min() - 숫자를 다루는 stream에서만 사용

		int r1 = list.stream().distinct().mapToInt(a -> a + 10).sum();
		System.out.println(r1);
		
		long r2 = list.stream().distinct().mapToInt(a -> a).count();
		System.out.println(r2);
		
		OptionalDouble r3 = list.stream().distinct().mapToDouble(a -> a).average();
		System.out.println(r3.getAsDouble()); //OptionalDouble형에서 double값 반환
		
		
		OptionalInt r4 = list.stream().distinct().mapToInt(a -> a).max();
		System.out.println(r4.getAsInt());
		
		System.out.println("---------------------------------------------------------------------");
		
		List<Integer> newl = list.stream().distinct()
								.filter(a -> (a > 50)).collect(Collectors.toList());
		
		System.out.println(newl);
		
		
		
		
		
		
		
	}
}
