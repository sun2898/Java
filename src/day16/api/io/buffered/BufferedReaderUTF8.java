package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderUTF8 {

	public static void main(String[] args) {

		/*
		 * 인코딩 = 파일or텍스트문서가 저장될 때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 * 디코딩 = 컴퓨터가 아는 이진수 형태 => 인간이 알고있는 문자형식으로 변경
		 * 
		 * 인코딩 대표형식
		 * 문자인코딩 - 보통 UTF-8 (유니코드) vs EUC-KR
		 * 파일 인코딩 Base64 (아스키코드)
		 * 
		 * InputStreamReader = 1byte기반 파일을  => 2byte기반으로 변경
		 * 파일을 읽을 때 인코딩 형식을 같이 지정할 수 있다.
		 * 
		 * 2가지 방법
		 * 1) 원본파일의 인코딩을 UTF-8로 변경
		 * 2) 파일의 인코딩 형식이 다르면 '한글'이 깨지게 되는데 인코딩을 동일한 형태로 맞춰서 가지고 오면 된다.
		 * 
		 */
		
		
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\test2.txt";
		
		//InputStream fis = new FileInputStream(path);//바이트 기반
		//Reader rd = new InputStreamReader(fis, "UTF-8"); //1바이트 기반 => 2바이트 기반
		//BufferedReader br = new Bufferedreader(rd); //2바이트 기반 빠른 읽기
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));){
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
