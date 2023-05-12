package day14.api.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
//		//car가 run을 사용할 때 마다 매번 다른기능으로 사용해야한다면 => 익명클래스를 사용한다.
//		Car car = new Car() { //
//		
//			@Override
//			public void run() {
//				System.out.println("익명 객체로 생성된 car");
//			
//			}
//		};
//		
//		car.run();
		
		//익명객체 표현 문법 => 람다 표현형식으로 사용이 가능
		Person p = new Person();
		p.greeting(new Say01() { // Anonymous Inner Type
			
			@Override
			public void hello() {
				System.out.println("헬로우 기능!");
				
			}
		});
		
		//Say01이 가지고 있는 hello()를 전달하는 모형
		p.greeting( () -> {System.out.println("람다 헬로우!"); } );
		
		//1문법 - 사용할 문장이 1줄 이라면 {} 생략가능
		p.greeting( () -> System.out.println("람다 헬로우!") );
		
//		p.greeting(new Say02() {
//			
//			@Override
//			public String hello(String a, int b) {
//				//프로그래머가 작성한 내용
//				return a + b;
//			}
//		});
	
		//2문법 - 람다의 매개변수는 타입이 생략
		//	   - 프로그램 코드가 한줄이라면 return도 생략
		p.greeting((a, b) -> a + b);
		
		//greeting의 3번째 메서드에 전달되는 값이 짝수인지 홀수 인지 판별하는 람다식
		p.greeting(a -> a % 2 == 0 ? true : false);
		
	}
}
