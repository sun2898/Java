package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능향상 스트림 (보조)
		 * 
		 * 보조스트림이라 부르고, Reader, Writer, InputStream, OutputStream
		 * 과 같이 사용됩니다.
		 */
		
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\text.txt";
		
//		Writer fw = new FileWriter(path);
//		BufferedWriter bw = new BufferedWriter(fw);
		
		//Writer객체에 두번째 매개변수에 true를 주면, 기존파일의 내용에 추가한다.
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			String str = "오늘은 날씨가 맑습니다.\n내일은 쉽니다.\n";
			
			bw.write(str);
			
			System.out.println("파일 쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
