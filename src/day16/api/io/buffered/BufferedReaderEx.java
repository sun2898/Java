package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상 보조스트림이다.
		 * Reader클래스와 같이 사용된다.
		 */
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\text.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String result;
			while((result = br.readLine()) != null) { // readLine() : 한줄씩 읽는다. 마지막줄이 끝나면 null 출력			
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
