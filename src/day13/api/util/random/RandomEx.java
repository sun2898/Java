package day13.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		//double d = Math.random();
		Random r = new Random();
		
		double d = r.nextDouble(); 
		System.out.println(d); //0이상~1미만
		
		int x = r.nextInt(); 
		System.out.println(x); //정수범위의 랜덤값(음수도 나올 수 있음)
		
		int y = r.nextInt(10); // 0이상 10미만
		System.out.println(y);
		
	}
}
