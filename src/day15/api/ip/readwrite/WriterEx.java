package day15.api.ip.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {
		
		/* 
		 * 문자를 써서 저장할 때는 2바이트 기반 클래스 FileWriter()를 사용한다.
		 */
		
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\text.txt";
		
		try(Writer fw = new FileWriter(path)){
			
			
			// \n줄바꿈, \r 캐리지리턴(맨 앞으로 당기기)
			String str = "그만 좀 자!! \n\r 공부해야지!!";
			
			fw.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
