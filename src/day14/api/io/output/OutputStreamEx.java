package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		
		String readPath = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\sssoc\\Desktop\\course\\work\\copyFile\\메서드1_copy.mp4";
		
		
		try (InputStream is = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath) ) {
				byte[] arr = new byte[2048];
				
				int result;
				while((result = is.read(arr)) != -1) { // 읽은 값이 -1이 아닐때까지
					//쓰기
					out.write(arr, 0, result); //arr데이터를 0에서 바이트배열의 result까지만 씀
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			
//			try {
//				is.close();
//				out.close();
//			} catch (Exception e2) {
//				System.out.println("파일close에러");
//			}
//			
//		}
		
		System.out.println("프로그램 정상종료");
	}
	
}
