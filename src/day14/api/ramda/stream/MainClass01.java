package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("홍길자");
		list.add("이순신");
		list.add("신사임당");
		list.add("홍길동");
		
		//스트림타입으로 변경 - 대부분 ramda함수로 만들어져 있음
		Stream <String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//			public void accept(String t) {
//				System.out.println(t);
//			};
//		});
		
		stream.forEach(a -> System.out.println(a));
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
