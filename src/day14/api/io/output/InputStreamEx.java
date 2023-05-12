package day14.api.io.output;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로가 들어갑니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt"; 
		
		//FileInputStream is = new FileInputStream(path);
		try {
			InputStream is = new FileInputStream(path);
			
			//1st
			//read()는 하나씩 데이터를 읽고, 더읽을 값이 없다면 -1을 반환
//			while(true) { 
//				int result = is.read();
//				if(result == -1) break; //그만
//				System.out.println( (char)result );
//			}
			
			//2nd
			//read(배열) 
			byte[] arr = new byte[100];
			int result = is.read(arr); 
			System.out.println(result); //읽어들인 크기 반환
			
			int i = 0;
			while(true) {
				if(arr[i] == 0) break;
				System.out.println( (char)arr[i] );
				i++;
			}
			
			int result2 = is.read(arr); //더 읽을 값이 없다면 -1반환
			System.out.println(result2);
			
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
